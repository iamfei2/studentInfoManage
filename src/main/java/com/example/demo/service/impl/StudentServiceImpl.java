package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
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
}
