package com.unitedcoder.jsonfile;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class VerifyJsonContent1 {
    public static void main(String[] args) {

        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream("JsonFile/CourseDetails.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath=new JsonPath(inputStream);
        String courseName=jsonPath.getString("Courses.WebAutomation[0].course-title");
        System.out.println(courseName);
        int price=jsonPath.getInt("Courses.Api[1].price");
        System.out.println(price);

        int size1=jsonPath.getInt("Courses.WebAutomation.size()");
        System.out.println(size1);
        int size2=jsonPath.getInt("Courses.Api.size()");
        System.out.println(size2);
        int totalPrice=0;
        //find the total price of courses using for loop
        for( int i=0; i<size1;i++) {
            int price1 = jsonPath.getInt("Courses.WebAutomation[" + i + "].price");
            totalPrice += price1;
        }
        for(int j=0; j<size2;j++){
                int price2=jsonPath.getInt("Courses.Api[" + j + "].price");
                totalPrice+=price2;
        }
        System.out.println(totalPrice);
    }
}
