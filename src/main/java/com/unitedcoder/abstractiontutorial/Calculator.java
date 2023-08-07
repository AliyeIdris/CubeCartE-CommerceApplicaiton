package com.unitedcoder.abstractiontutorial;

public class Calculator implements SimpleCalculator,IAdvancedCalculator{
    @Override
    public double addTwoNumbers(double d1, double d2) {
        System.out.println(String.format("%.2f + %.2f = %.2f",d1,d2,d1+d2));
        return d1+d2;
    }

    @Override
    public double divideTwoNumbers(double d1, double d2) {
        if(d2==0){
            System.out.println("Denominator can not be zero");
            return 0;
        }else {
            System.out.println(String.format("%f/%f = %.2f",d1,d2,d1/d2));
            return d1/d2;
        }
    }

    @Override
    public long subtract(long l1, long l2) {
        System.out.println(String.format("%d - %d = %d",l1,l2,l1-l2));
        return l1-l2;
    }

    @Override
    public long multiply(int a, int b) {
        System.out.println("Multiplication value is" +a*b);
        return a*b;
    }

    @Override
    public void addThreeNumbers(int a, int b, int c) {

    }

    @Override
    public double calculatePower(int base, int power) {
        System.out.println(String.format("%d power of %d is %.2f",base,power,Math.pow(base,power)));
        return Math.pow(base,power);
    }

    @Override
    public double calculateSquareRoot(long l) {
        System.out.println(String.format("Square root of %d is: %.2f",l,Math.sqrt(l)));
        return Math.sqrt(l);
    }

    @Override
    public int calculateAbsoluteValue(int x) {
        System.out.println(String.format("Absolute value of %d is: %d",x,Math.abs(x)));
        return Math.abs(x);
    }
}
