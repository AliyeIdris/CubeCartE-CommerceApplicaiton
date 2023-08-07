package com.unitedcoder.jsonfile.serilization2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteJavaWithCourseDetails {
    public static void main(String[] args) {
        List<WebAutomationPojo> webAutomation =new ArrayList<>();
        webAutomation.add(new WebAutomationPojo("Selenium Webdriver-Java",50));
        webAutomation.add(new WebAutomationPojo("PlayWrite",100));
        webAutomation.add(new WebAutomationPojo("Cypress - Java Script",80));
        List<ApiPojo> apis=new ArrayList<>();
        apis.add(new ApiPojo("Rest-Assured-Api",45));
        apis.add(new ApiPojo("Soup-UI-WebServices",30));
        CoursesPojo courses=new CoursesPojo(webAutomation,apis);

        CourseInfoPojo courseInfoPojo = new CourseInfoPojo("SDET Training", "Test Automation", "Dolkun Tarim",
                "https://www.linkenin.com", "Https://www.udemy.com",courses);

        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(new File("JsonFile/CourseDetails.json"),courseInfoPojo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
