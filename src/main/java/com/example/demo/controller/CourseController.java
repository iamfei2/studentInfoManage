package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.QueryPagePara;
import com.example.demo.common.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lt
 * @since 2024-10-27
 */


import com.example.demo.entity.Course;
import com.example.demo.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lt
 * @since 2024-10-27
 */
@ControllerAdvice
@Controller
@RestController
@RequestMapping("/course")
public class CourseController {
//    @Autowired
//    private ICourseService courseService;
//
//    //新增
//    @PostMapping("/save")
//    public Result save(@RequestBody Course course) {
//        return courseService.save(course)?Result.suc():Result.fail();
//    }
//    //修改
//    @PostMapping("/modify")
//    public boolean modify(@RequestBody Course course) {
//        return courseService.updateById(course);
//    }
//    //新增或修改
//    @PostMapping("/saveOrModify")
//    public boolean saveOrModify(@RequestBody Course course) {
//        return courseService.saveOrUpdate(course);
//    }
//    //删除
//    @GetMapping("/delete")
//    public boolean delete(Integer id) {
//        return courseService.removeById(id);
//    }
//    //查询（模糊、匹配）
//    @PostMapping("/search")
//    public List<Course> search(@RequestBody Course course) {
//        LambdaQueryWrapper<Course> lambdaQueryWrapper=new LambdaQueryWrapper();
//        lambdaQueryWrapper.like(Course::getCourseName,course.getCourseName());
//        return courseService.list(lambdaQueryWrapper);
//    }
//
//    @PostMapping("/listPage")
//    public Result list(@RequestBody Course course) {
////        System.out.println(query);
//////        LambdaQueryWrapper<Course> lambdaQueryWrapper=new LambdaQueryWrapper();
//////        lambdaQueryWrapper.like(Course::getCourseName,course.getCourseName());
////        System.out.println(query.getPageNum());
////        HashMap para=query.getPara();
////        System.out.println(para.get("courseName"));
//
//        LambdaQueryWrapper<Course> lambdaQueryWrapper=new LambdaQueryWrapper();
//        if(!StringUtils.isEmpty(course.getCourseId())){
//            lambdaQueryWrapper.eq(Course::getCourseId,course.getCourseId());
//        }
//
//        return Result.suc("successful search",courseService.list(lambdaQueryWrapper));
//    }
//




}
