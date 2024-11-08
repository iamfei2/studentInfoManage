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
@ApiModel(value = "Favorites对象", description = "")
public class Favorites implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("favorite_id")
    private String favoriteId;

    private String studentId;

    private String favoriteName;

    private String favoriteDescription;

    private Integer favoritePrivacy;

    private LocalDateTime favoriteCreatetime;

    public String getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(String favoriteId) {
        this.favoriteId = favoriteId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFavoriteName() {
        return favoriteName;
    }

    public void setFavoriteName(String favoriteName) {
        this.favoriteName = favoriteName;
    }

    public String getFavoriteDescription() {
        return favoriteDescription;
    }

    public void setFavoriteDescription(String favoriteDescription) {
        this.favoriteDescription = favoriteDescription;
    }

    public Integer getFavoritePrivacy() {
        return favoritePrivacy;
    }

    public void setFavoritePrivacy(Integer favoritePrivacy) {
        this.favoritePrivacy = favoritePrivacy;
    }

    public LocalDateTime getFavoriteCreatetime() {
        return favoriteCreatetime;
    }

    public void setFavoriteCreatetime(LocalDateTime favoriteCreatetime) {
        this.favoriteCreatetime = favoriteCreatetime;
    }

    @Override
    public String toString() {
        return "Favorites{" +
            "favoriteId = " + favoriteId +
            ", studentId = " + studentId +
            ", favoriteName = " + favoriteName +
            ", favoriteDescription = " + favoriteDescription +
            ", favoritePrivacy = " + favoritePrivacy +
            ", favoriteCreatetime = " + favoriteCreatetime +
        "}";
    }
}
