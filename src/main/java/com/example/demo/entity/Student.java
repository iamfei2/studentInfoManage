package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lt
 * @since 2024-11-06
 */
@ApiModel(value = "Student对象", description = "")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("student_id")
    private String studentId;

    private String studentName;

    private String studentGender;

    private String studentPassward;

    private int roleId=1;

    public int getRole_id() {
        return roleId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPassward() {
        return studentPassward;
    }

    public void setStudentPassward(String studentPassward) {
        this.studentPassward = studentPassward;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    @Override
    public String toString() {
        return "Student{" +
            "studentId = " + studentId +
            ", studentName = " + studentName +
            ", studentGender = " + studentGender + ", studentPassward = " + studentPassward +
        "}";
    }
}
