package com.unitedcoder.abstractiontutorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        calculator.addTwoNumbers(5,7);
        calculator.subtract(19,13);
        calculator.multiply(8,5);
        calculator.divideTwoNumbers(564,7);
        calculator.divideTwoNumbers(45,0);
        calculator.calculatePower(2,5);
        calculator.calculateSquareRoot(786);
        calculator.calculateAbsoluteValue(-56);
        SimpleCalculator.testCalculator(); //because method is static, we can access at class level

    }
}
