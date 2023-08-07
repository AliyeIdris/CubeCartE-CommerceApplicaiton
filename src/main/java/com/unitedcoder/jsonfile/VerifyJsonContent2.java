package com.unitedcoder.jsonfile;

import io.restassured.path.json.JsonPath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class VerifyJsonContent2 {
    public static void main(String[] args) {
        //find the total price of courses using foreach loop

        FileInputStream inputStream= null;
        try {
            inputStream = new FileInputStream("JsonFile/CourseDetails.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JsonPath jsonPath=new JsonPath(inputStream);
        String [] paths={"Courses.WebAutomation","Courses.Api"};
        int totalPrice=0;

        for (String path:paths){
            int size=jsonPath.getInt(path+".size");
            for( int i=0; i<size;i++){
                int price=jsonPath.getInt(path + "["+ i + "].price");
                totalPrice+=price;
            }
        }
        System.out.println("Total Price: "+totalPrice);
    }
}
