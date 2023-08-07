package com.unitedcoder.lambdaexpression;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //Supplier only has one abstract method -- get()
        Supplier<Date> d=()->new Date();
        System.out.println(d.get());
    }
}
