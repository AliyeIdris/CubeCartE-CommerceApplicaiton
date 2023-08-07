package com.unitedcoder.jsonfile.serilization2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAutomationPojo {
    @JsonProperty("course title")
    private String courseTitle;
    @JsonProperty("price")
    private int price;

    public WebAutomationPojo() {
    }

    public WebAutomationPojo(String courseTitle, int price) {
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
