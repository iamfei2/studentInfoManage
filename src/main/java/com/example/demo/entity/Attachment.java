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
 * @since 2024-11-08
 */
@ApiModel(value = "Attachment对象", description = "")
public class Attachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("attachment_id")
    private String attachmentId;

    private String courseId;

    private String attachmentName;

    private String attachmentContent;

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentContent() {
        return attachmentContent;
    }

    public void setAttachmentContent(String attachmentContent) {
        this.attachmentContent = attachmentContent;
    }

    @Override
    public String toString() {
        return "Attachment{" +
            "attachmentId = " + attachmentId +
            ", courseId = " + courseId +
            ", attachmentName = " + attachmentName +
            ", attachmentContent = " + attachmentContent +
        "}";
    }
}
