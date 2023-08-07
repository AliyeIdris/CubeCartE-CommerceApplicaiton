package com.unitedcoder.polymorphism;

public class MethodOverloading {

    public void add(int a, int b){
        System.out.println(a+b);

    }

    //by changing the data type
    public void add(long a, int b){
        System.out.println(a+b);

    }

    // by changing the argument number
    public void add(long a, int b, int c){
        System.out.println(a+b+c);

    }

}
