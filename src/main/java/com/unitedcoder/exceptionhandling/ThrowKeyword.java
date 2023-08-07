package com.unitedcoder.exceptionhandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int x=scan.nextInt();
        try{
        if(x>20){
            throw new ArithmeticException();
        }else if(x<20){
            throw new NullPointerException();
        }else{
            System.out.println("Congratulations");
        }
        } catch (Exception e){
            System.out.println("Invalid input");
        }

    }

}
