package com.unitedcoder.datatypes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {
        // define a Scanner Object
        //next()-- only print one value
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your first Name: ");
        String firstName=scan.next();
        System.out.println("Your first name is " +firstName);

        System.out.println("Please enter your last Name: ");
        String lastName=scan.next();
        System.out.println("Your last Name is: "+lastName);

        //nextLine()-- print all values entered
        Scanner full= new Scanner(System.in);
        System.out.println("Please enter your first name and last name: ");
        String fullName=full.nextLine();
        System.out.println("Your full name is " +fullName);
        System.out.println("Please enter your age: ");
        int age= scan.nextInt();
        System.out.println(String.format("Your age is %s", age)); //leave raw
        System.out.printf("Your age is %d", age); //not leave raw


    }
}
