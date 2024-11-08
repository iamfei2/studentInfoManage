package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@ApiModel(value = "Work对象", description = "")
public class Work implements Serializable {

    private static final long serialVersionUID = 1L;

    private String workId;

    private String courseId;

    private String workName;

    private String workDescription;

    private String workContent;

    private LocalDateTime workStime;

    private LocalDateTime workEtime;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getWorkDescription() {
        return workDescription;
    }

    public void setWorkDescription(String workDescription) {
        this.workDescription = workDescription;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }

    public LocalDateTime getWorkStime() {
        return workStime;
    }

    public void setWorkStime(LocalDateTime workStime) {
        this.workStime = workStime;
    }

    public LocalDateTime getWorkEtime() {
        return workEtime;
    }

    public void setWorkEtime(LocalDateTime workEtime) {
        this.workEtime = workEtime;
    }

    @Override
    public String toString() {
        return "Work{" +
            "workId = " + workId +
            ", courseId = " + courseId +
            ", workName = " + workName +
            ", workDescription = " + workDescription +
            ", workContent = " + workContent +
            ", workStime = " + workStime +
            ", workEtime = " + workEtime +
        "}";
    }
}
