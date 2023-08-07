package com.unitedcoder.methodtutorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.CalculatorInfo();
        calculator.sum(3,4);
        calculator.multiply(3,4);
        calculator.sum(5,10);
        calculator.multiply(5,10);
        calculator.sum(45.6565,43.57567);
        calculator.sumMultipleNumbers(23,56,432,9,765);
    }

}
