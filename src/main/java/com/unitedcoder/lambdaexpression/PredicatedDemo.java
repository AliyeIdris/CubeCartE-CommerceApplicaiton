package com.unitedcoder.lambdaexpression;

import java.util.function.Predicate;

public class PredicatedDemo {
    public static void main(String[] args) {
        //Predicate  has only one abstract method -- test()
        Predicate<Integer> predicate=t->(t>=400);
        System.out.println(predicate.test(200));

        Predicate<String> p1=s->(s.length()>4);
        System.out.println(p1.test("United Coder"));
        System.out.println(p1.test("Software Testing"));
        System.out.println(p1.test("Java"));
    }

}
