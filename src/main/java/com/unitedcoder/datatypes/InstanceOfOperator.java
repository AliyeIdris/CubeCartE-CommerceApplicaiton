package com.unitedcoder.datatypes;

public class InstanceOfOperator {
    public static void main(String[] args) {

        Number a = 10.5;
        Number b = 15;
        System.out.println(a instanceof Double);
        System.out.println(b instanceof Integer);

        Number c= 10.5f;
        System.out.println(c instanceof Float);

        Number d=1223455L;
        System.out.println(d instanceof Long);

        Object f=100;
        System.out.println(d instanceof Object);

        Object l="United Coder";
        System.out.println(l instanceof String);
    }
}
