package com.haobi.listviewdemo;

/**
 * Created by 15739 on 2019/7/15.
 */

public class Weather {
    private String name;
    private int imageId;

    public Weather(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
