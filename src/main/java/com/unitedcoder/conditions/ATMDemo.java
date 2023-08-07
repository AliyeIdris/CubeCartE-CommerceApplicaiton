package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        int pin=1234;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your password:");
        int password=input.nextInt();
        if (password==pin) {
            System.out.println("Your account number is 2432343543");
            System.out.println("Your balance is 10000$.");
        } else {
            System.out.println("Please enter correct pin number.");
        }
    }

}
