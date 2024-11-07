package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.entity.Student;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lt
 * @since 2024-11-06
 */
@ControllerAdvice
@Controller
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/login")
    public Result<Map<String, Object>> login(@RequestBody Student student) {
        Map<String,Object> data=studentService.login(student);
        if(data != null){
            return Result.suc(data);
        }
        return Result.fail("用户名或密码错误");

    }
}
