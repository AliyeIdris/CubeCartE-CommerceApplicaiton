package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day with related number");
        String day =input.nextLine();
        if (StringUtils.isNumeric(day)) {
            switch (Integer.parseInt(day)) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Please enter valid number between 1-7");
                    break;
            }
        } else {
            System.out.println("Please enter only numeric value!");
        }

    }
}
