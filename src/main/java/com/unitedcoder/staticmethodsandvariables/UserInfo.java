package com.unitedcoder.staticmethodsandvariables;

public class UserInfo {

    static int userId;
    static String userName;
    static int age;

    public UserInfo() {
    }
    public UserInfo(int userId, String userName, int age) {
        this.userId=userId;
        this.userName=userName;
        this.age= age;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserInfo.userId = userId;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserInfo.userName = userName;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        UserInfo.age = age;
    }
}
