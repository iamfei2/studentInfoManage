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
@ApiModel(value = "Note对象", description = "")
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("note_id")
    private String noteId;

    private String favoriteId;

    private String noteName;

    private String noteContent;

    private LocalDateTime noteCreatetime;

    private String noteUpid;

    public String getNoteId() {
        return noteId;
    }

    public void setNoteId(String noteId) {
        this.noteId = noteId;
    }

    public String getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public LocalDateTime getNoteCreatetime() {
        return noteCreatetime;
    }

    public void setNoteCreatetime(LocalDateTime noteCreatetime) {
        this.noteCreatetime = noteCreatetime;
    }

    public String getNoteUpid() {
        return noteUpid;
    }

    public void setNoteUpid(String noteUpid) {
        this.noteUpid = noteUpid;
    }

    @Override
    public String toString() {
        return "Note{" +
            "noteId = " + noteId +
            ", favoriteId = " + favoriteId +
            ", noteName = " + noteName +
            ", noteContent = " + noteContent +
            ", noteCreatetime = " + noteCreatetime +
            ", noteUpid = " + noteUpid +
        "}";
    }
}
