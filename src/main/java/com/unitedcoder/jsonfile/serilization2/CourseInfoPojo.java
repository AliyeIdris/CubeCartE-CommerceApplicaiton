package com.unitedcoder.jsonfile.serilization2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseInfoPojo {
    @JsonProperty("Services")
    private String services;
    @JsonProperty("expertise")
    private String expertise;
    @JsonProperty("instructor")
    private String instructor;
    @JsonProperty("linkedIn")
    private String linkedIn;
    @JsonProperty("url")
    private String url;
    @JsonProperty("Courses")
    private CoursesPojo Courses;

    public CourseInfoPojo() {
    }

    public CourseInfoPojo(String services, String expertise, String instructor, String linkedIn, String url, CoursesPojo Courses) {
        this.services = services;
        this.expertise = expertise;
        this.instructor = instructor;
        this.linkedIn = linkedIn;
        this.url = url;
        this.Courses = Courses;
    }

    public String getServices() {
        return services;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public String getUrl() {
        return url;
    }

    public CoursesPojo getCourses() {
        return Courses;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "services='" + services + '\'' +
                ", expertise='" + expertise + '\'' +
                ", instructor='" + instructor + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", url='" + url + '\'' +
                ", Courses=" + Courses +
                '}';
    }
}
