package com.example.demo.service.impl;

import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lt
 * @since 2024-11-06
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Map<String, Object> login(Student student) {
        //查询
        LambdaQueryWrapper<Student> wrapper=new LambdaQueryWrapper<>();
        wrapper.eq(Student::getStudentId,student.getStudentId());
        wrapper.eq(Student::getStudentPassward,student.getStudentPassward());
        Student loginStudent=this.baseMapper.selectOne(wrapper);

        //结果不空则生成token，并将信息存入redis
        if(loginStudent != null){
            //uuid
            String key="user:"+UUID.randomUUID();

            //存入redis
            loginStudent.setStudentPassward(null);
            redisTemplate.opsForValue().set(key,loginStudent,30, TimeUnit.MINUTES);
            //返回数据
            Map<String,Object> data=new HashMap<>();
            data.put("token",key);
            return data;
        }
        return null;
    }

    @Override
    public Map<String,Object> getStudentInfo(String token) {
        //根据token获取学生信息
        Object ob=redisTemplate.opsForValue().get(token);
        if(ob!=null){
            Student LoginStudent = JSON.parseObject(JSON.toJSONString(ob),Student.class);
            Map<String,Object> data=new HashMap<>();
            data.put("studentId",LoginStudent.getStudentId());
            data.put("studentName",LoginStudent.getStudentName());
            data.put("studentGender",LoginStudent.getStudentGender());
            data.put("roleId",LoginStudent.getRole_id());

            return data;
        }
    return null;
    }

    public List<String> getCourseIdByStudentId(String studentId){
        return this.baseMapper.getCourseIdByStudentId(studentId);
    }

}



