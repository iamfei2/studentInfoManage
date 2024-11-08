package com.example.demo.mapper;

import com.example.demo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lt
 * @since 2024-11-06
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    public List<String> getCourseIdByStudentId(String studentId);
}
