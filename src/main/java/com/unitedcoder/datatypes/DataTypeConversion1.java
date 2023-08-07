package com.unitedcoder.datatypes;

public class DataTypeConversion1 {
    public static void main (String [] args){
        //Widening Casting(automatically) -converting a smaller type to a larger type size
        //byte -> short -> char -> int -> long -> float -> double

        int a = 1000;
        double b = a; //automatic casting : int to double
        System.out.println(a); //1000
        System.out.println(b); //1000.0

        float j=7.65f;
        int k= (int) j;
        System.out.println(j);
        System.out.println(k);

        //Narrowing Casting(manually) - converting a larger type to a smaller size type
        //double -> float -> long -> int -> char -> short -> byte

        double c=1000.0;
        int d =(int) c;
        System.out.println(d);

        double myDouble = 9.78d;
        int myInt= (int) myDouble; //Manual casting: double to int
        System.out.println(myDouble);
        System.out.println(myInt);

        int m= 35;
        float n= (float) m;
        System.out.println(m);
        System.out.println(n);


    }
}
