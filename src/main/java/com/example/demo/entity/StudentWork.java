package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lt
 * @since 2024-11-07
 */
@TableName("student_work")
@ApiModel(value = "StudentWork对象", description = "")
public class StudentWork implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("work_id")
    private String workId;

    private String studentId;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentWork{" +
            "workId = " + workId +
            ", studentId = " + studentId +
        "}";
    }
}
