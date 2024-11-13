package com.estudosjava.dreamgames.dto;


import com.estudosjava.dreamgames.entities.Game;
import jakarta.persistence.Column;

public class GameMinDto {
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto(){

    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        year = entity.getYear();
        shortDescription = entity.getShortDescription();
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Integer getYear() {
        return year;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
