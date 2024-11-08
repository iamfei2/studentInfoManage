package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2024-11-08
 */
@ApiModel(value = "Comment对象", description = "")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("comment_id")
    private String commentId;

    private String postingsId;

    private String commentText;

    private String commentUpid;

    private LocalDateTime commentTime;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getPostingsId() {
        return postingsId;
    }

    public void setPostingsId(String postingsId) {
        this.postingsId = postingsId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentUpid() {
        return commentUpid;
    }

    public void setCommentUpid(String commentUpid) {
        this.commentUpid = commentUpid;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    @Override
    public String toString() {
        return "Comment{" +
            "commentId = " + commentId +
            ", postingsId = " + postingsId +
            ", commentText = " + commentText +
            ", commentUpid = " + commentUpid +
            ", commentTime = " + commentTime +
        "}";
    }
}
