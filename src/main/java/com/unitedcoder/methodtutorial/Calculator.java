package com.unitedcoder.methodtutorial;

public class Calculator {
    //method for print calculator information
    public void CalculatorInfo() {
        System.out.println("Sony Simple Calculator");
        System.out.println("Hope you enjoy the use!!!");

    }

    //method for add two number
    public int sum(int number1, int number2) {
        System.out.println("Sum is: "+(number1+number2));
        return number1+number2;

    }

    //method for multiply two numbers
    public int multiply(int number1,int number2){
        System.out.println("Multiply is: "+number1*number2);
        return number1*number2;
    }

    public int sum(double number1, double number2) {
        System.out.println("Sum is: "+(number1+number2));
        return (int)(number1+number2);

    }

    public int sumMultipleNumbers(int...numbers){
        int sum=0;
        for(int eachNumber:numbers){
            sum +=eachNumber;
        }
        System.out.println("Sum: "+sum);
        return sum;
    }
}
