package com.unitedcoder.loops;

public class DifferenceBetweenWhileDoWhileLoop {
    public static void main(String[] args) {
        int a =10;
        while (a>5){
            System.out.println("While Block");
            a--;
        }

        int b=0;
        do {
            System.out.println("Do while block");
            b--;
        } while (b>5);
    }
}
