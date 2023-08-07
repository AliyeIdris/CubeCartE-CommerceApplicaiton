package com.unitedcoder.jsonfile.serilization2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiPojo {

    @JsonProperty("course title")
    private String courseTitle;
    @JsonProperty("price")
    private int price;

    public ApiPojo() {
    }

    public ApiPojo(String courseTitle, int price) {
        this.courseTitle = courseTitle;
        this.price = price;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getPrice() {
        return price;
    }
}
