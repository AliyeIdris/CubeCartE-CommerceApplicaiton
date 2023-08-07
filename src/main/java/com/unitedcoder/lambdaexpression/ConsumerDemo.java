package com.unitedcoder.lambdaexpression;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        // Consumer only has one abstract method -- accept()
        Consumer<String> c1=s-> System.out.println(s+" is easy");
        c1.accept("Coding");
    }
}
