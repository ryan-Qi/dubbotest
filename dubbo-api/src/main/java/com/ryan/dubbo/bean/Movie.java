package com.ryan.dubbo.bean;

import java.io.Serializable;

public class Movie implements Serializable {
    private Integer id;
    private String movieName;
    private Double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movie) {
        this.movieName = movie;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
