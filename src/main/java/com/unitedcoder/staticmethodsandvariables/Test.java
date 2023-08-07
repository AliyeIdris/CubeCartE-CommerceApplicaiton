package com.unitedcoder.staticmethodsandvariables;

public class Test {
    public static void main(String[] args) {
        CustomerInfo customerInfo= new CustomerInfo();
        customerInfo.setAge(18);

        UserInfo.age=18;
        UserInfo.age=20;
        System.out.println();
        UserInfo.setUserName("Tom");
        System.out.println(UserInfo.getUserName());
    }
}
