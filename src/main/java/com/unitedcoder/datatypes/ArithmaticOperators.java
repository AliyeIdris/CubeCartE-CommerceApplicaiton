package com.unitedcoder.datatypes;

public class ArithmaticOperators {
    public static void main(String[] args) {
        // Arithmatic Operators + - * / % ++ --

        // + addition
        int a=4; int b =5;
        System.out.println(a+b);

        // - subtraction
        int d=10; int e =8;
        int e1= d-e;
        System.out.println(e1);

        // * multiplicaiton
        int g=d*e;
        System.out.println(g);


        // division
        int aa=16;
        int aa1=4;
        int aa2= aa/aa1;
        System.out.println(aa2); //4

        // % Modules / Remainder
        int bb=5;
        int bb1=3;
        int bb2=bb%bb1;
        System.out.println(bb2);

        // ++ Increment
        int q= 10;
        q++;
        System.out.println(q);

        // --Decrement
        int p =15;
        p --;
        System.out.println(p);

        // Pre increment ++a - Post increment a++
        //Pre increment ++a: first plus 1 then execute
        //Post increment a++: first execute then plus 1

        // Pre decrement --a Post decrement a--
        //Pre decrement --a: first minus 1 then execute
        //Post decrement a--: first execute then minus 1
        int t=20;
        ++t; //21
        t++; //22
        --t; //21
        t--; //20
        System.out.println(t);

        int c = 1;
        int m = c++; //pre-increment
        System.out.println(m); // 1

        int l = 1;
        int n = ++l; //post-increment
        System.out.println(n); // 2

        int tt =25;
        int gg = tt++;
        int yy = --tt;
        tt++; //26
        ++tt; //27
        System.out.println(gg); //25
        System.out.println(yy); //24
        System.out.println(tt); //27


    }
}
