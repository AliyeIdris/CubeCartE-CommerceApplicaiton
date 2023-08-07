package com.unitedcoder.abstractiontutorial;

public interface SimpleCalculator {

    //all variables in interface are static final by default
    String Version="3.0";


    //all methods in interface are public abstract by default
    double addTwoNumbers(double d1, double d2); //no body method is called abstract method
    double divideTwoNumbers(double d1, double d2);
    long subtract(long l1, long l2);
    long multiply(int a, int b);

    default void addThreeNumbers(int a, int b, int c){ //in default method we can have body
        System.out.println(a+b+c);
    }

    static void testCalculator(){
        System.out.println("This is test Calculator");
    }
}
