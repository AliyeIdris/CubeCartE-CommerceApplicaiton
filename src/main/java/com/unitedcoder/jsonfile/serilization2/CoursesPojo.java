package com.unitedcoder.jsonfile.serilization2;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CoursesPojo {
@JsonProperty("WebAutomation")
    private List<WebAutomationPojo> webAutomation;
@JsonProperty("Api")
    private List<ApiPojo> api;

    public CoursesPojo() {
    }

    public CoursesPojo(List<WebAutomationPojo> webAutomation, List<ApiPojo> api) {
        this.webAutomation = webAutomation;
        this.api = api;
    }

    public List<WebAutomationPojo> getWebAutomation() {
        return webAutomation;
    }

    public List<ApiPojo> getApi() {
        return api;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "webAutomation=" + webAutomation +
                ", api=" + api +
                '}';
    }
}
