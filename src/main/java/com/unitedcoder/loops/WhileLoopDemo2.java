package com.unitedcoder.loops;

import com.unitedcoder.datatypes.ScannerObject;

import java.util.Scanner;

public class WhileLoopDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumberCount=0;
        int negativeNumberCount=0;
        while (true){
            int number=scan.nextInt();
            if (number>0)
                positiveNumberCount++;
                else if(number <0){
                    negativeNumberCount++;

                }else{
                    break;
            }

        }
        System.out.println("Positive number count: " +positiveNumberCount);
        System.out.println("Negative number count: "+negativeNumberCount);


    }
}
