package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {

        // 12 months 4 season
        // 3, 4, 5 ---Spring  6, 7, 8 ---Summer 9, 10, 11 --- Autumn 12, 1, 2 ---Winter
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter month with corresponding number:");
        String month =input.nextLine();
        if(StringUtils.isNumeric(month)){
            switch (Integer.parseInt(month)){
                case 3:
                case 4:
                case 5:
                    System.out.println("It is Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("It is Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("It is Autumn");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("It is Winter");
                    break;
                default:
                    System.out.println("Please enter valid month between 1-12");
                    break;

            }
        }else {
            System.out.println("Please enter only numeric value!");
        }

    }
}
