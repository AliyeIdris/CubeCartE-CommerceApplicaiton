package com.unitedcoder.exceptionhandling;

public class CustomizedException {
    public static void main(String[] args) {
        login("testautomation","automation123!");
    }
    public static void login (String userName, String password){
        if(!userName.equalsIgnoreCase("testautomation1")
                || !password.equalsIgnoreCase("automation123!"))
        try {
            throw new LoggedWithIncorrectCredential();
        } catch (LoggedWithIncorrectCredential e) {
            System.out.println("Login Exception occurred!!!");
        }

    }
}
