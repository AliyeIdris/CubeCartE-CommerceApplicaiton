package com.unitedcoder.datatypes;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BitwiseOperator {
    public static void main(String[] args) {
        //Bitwise Operator
        // 0 1
        // 1 = true
        //0 =false

        //bitwise &
        /*           1 & 1 = 1               true & true = true
                     1 & 0 = 0               true & false = false
                     0 & 1 = 0               false & true  = false
                     0 & 0 = 0               false & false = false

        bitwise ||
                     1 || 1 = 1              true || true = true
                     1 || 0 = 1              true || false = true
                     0 || 1 = 1              false || true = true
                     0 || 0 = 0              false || false = false
         */

        int a =25;       //11001
        int b= 15;      // 1111
        int c =(a & b);  // 1001
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));

        int d = a|b; //11111
        System.out.println(d);
        System.out.println(Integer.toBinaryString(d));
    }
}
