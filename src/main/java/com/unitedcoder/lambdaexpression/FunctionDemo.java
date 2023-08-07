package com.unitedcoder.lambdaexpression;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function only has one abstract method -- apply()
        Function<Integer,Integer> f1= i->i*2;
        System.out.println(f1.apply(20));

        Function<String,Integer> f2=s -> s.length();
        System.out.println(f2.apply("Aliye Idris"));
    }
}
