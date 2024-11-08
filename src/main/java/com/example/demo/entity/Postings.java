package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author lt
 * @since 2024-11-08
 */
@ApiModel(value = "Postings对象", description = "")
public class Postings implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("postings_id")
    private String postingsId;

    private String courseId;

    private String postingsName;

    private String postingsText;

    private String postingsUpid;

    private LocalDate postingsTime;

    private Integer postingsReplynum;

    public String getPostingsId() {
        return postingsId;
    }

    public void setPostingsId(String postingsId) {
        this.postingsId = postingsId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getPostingsName() {
        return postingsName;
    }

    public void setPostingsName(String postingsName) {
        this.postingsName = postingsName;
    }

    public String getPostingsText() {
        return postingsText;
    }

    public void setPostingsText(String postingsText) {
        this.postingsText = postingsText;
    }

    public String getPostingsUpid() {
        return postingsUpid;
    }

    public void setPostingsUpid(String postingsUpid) {
        this.postingsUpid = postingsUpid;
    }

    public LocalDate getPostingsTime() {
        return postingsTime;
    }

    public void setPostingsTime(LocalDate postingsTime) {
        this.postingsTime = postingsTime;
    }

    public Integer getPostingsReplynum() {
        return postingsReplynum;
    }

    public void setPostingsReplynum(Integer postingsReplynum) {
        this.postingsReplynum = postingsReplynum;
    }

    @Override
    public String toString() {
        return "Postings{" +
            "postingsId = " + postingsId +
            ", courseId = " + courseId +
            ", postingsName = " + postingsName +
            ", postingsText = " + postingsText +
            ", postingsUpid = " + postingsUpid +
            ", postingsTime = " + postingsTime +
            ", postingsReplynum = " + postingsReplynum +
        "}";
    }
}
