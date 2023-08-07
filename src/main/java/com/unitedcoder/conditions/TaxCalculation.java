package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) throws ParseException {
        String s= "Single";
        String m ="Married";
        System.out.println( "Please enter your status: ");
        Scanner scan = new Scanner(System.in);
        String status= scan.nextLine();
        String mySalary;
        if (!StringUtils.isNumeric(status) && !status.contains("-")){
            switch (status.toLowerCase()){
                case "single":
                    System.out.println("Please enter your annual salary: ");
                    mySalary =scan.nextLine();
                    if (mySalary.contains("-") | mySalary.isEmpty()| mySalary.isBlank() | StringUtils.isAlpha(mySalary)){
                        System.out.println("Invalid input: Please enter abs digit number!");
                    }else {
                        if (mySalary.contains(",") | mySalary.contains(".")) {
                            double annualSalary = DecimalFormat.getNumberInstance().parse(mySalary).doubleValue();
                        } else {
                            double annualSalary = Double.parseDouble(mySalary);
                            System.out.println(String.format("Your annual salary is %.2f ", annualSalary));
                            if (annualSalary <= 32000) {
                                System.out.println(String.format("You need to pay 10% tax, Your tax based on your salary is %.2f", annualSalary * 0.1));
                            } else {
                                System.out.println(String.format("Your salary is grater than 32000, so you need to pay 25% tax, Your total tax is %.2f", annualSalary * 0.25));
                            }
                        }
                    }
                            break;
                case "married":
                    System.out.println("Please enter your annual salary: ");
                    mySalary=scan.nextLine();
                    if (mySalary.contains("-")| mySalary.isBlank()| mySalary.isEmpty()|!StringUtils.isNumeric(mySalary)| mySalary instanceof String) {
                        System.out.println("Invalid input: Please enter abs digit number");
                    } else {
                        double annualSalary =Double.parseDouble(mySalary);
                        System.out.println("Your annual salary is " +annualSalary);
                        if (annualSalary<= 64000) {
                            System.out.println(String.format("You need to pay 10% tax, Your tax based on your salary is %.2f: ", annualSalary * 0.1));
                        }else {
                            System.out.println(String.format("Your salary is greater than 64000, so you need to pay 25% tax, Your total tax is %.2f",annualSalary*0.25));
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter correct status with 'single' or 'married'!!! ");
            }
        } else {
            System.out.println("Wrong: Please enter your actual status!!!");
        }
    }
}
