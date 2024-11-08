package com.example.demo.service;

import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;
import java.util.List;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lt
 * @since 2024-11-06
 */
public interface IStudentService extends IService<Student> {

    Map<String, Object> login(Student student);

    Map<String, Object> getStudentInfo(String token);

    List<String> getCourseIdByStudentId(String studentId);
}
