package com.unitedcoder.datatypes;

public class ComparisonOperators {
    public static void main(String[] args) {

        // code block
        // >, <, <=, !=, ==

        // > Greater than
        int a = 5;
        int b = 10;
        boolean c = a > b;
        System.out.println(a>b);
        System.out.println(c);

        // < Less than
        boolean c1 = a<b;
        System.out.println(c1);

        // >= Greater than or equal to
        int a1 = 15;
        int a2 = 15;
        int a3= 16;
        boolean a4 = a1>=a2;
        boolean a5 = a3 >= a1;
        System.out.println(a4);
        System.out.println(a5);

        // <= less than or equal to
        boolean d = a1 <= a2;
        boolean f = a3 <= a2 ;
        System.out.println(d);
        System.out.println(f);

        // == equal to
        boolean r = a1 == a2;
        boolean t = a1 == a3;
        System.out.println(r);
        System.out.println(t);

        // != not equal
        boolean w = a1 != a2;
        boolean u = a1 != a3;
        System.out.println(w);
        System.out.println(u);



    }
}
