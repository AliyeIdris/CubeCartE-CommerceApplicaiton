package com.unitedcoder.datatypes;

public class MainMethodArguments {
    public static void main(String[] args) {
/*
        //define an argument
        int a= Integer.parseInt(args[0]);
        System.out.println(a);

        int a1= Integer.parseInt(args[1]);
        System.out.println(a1);

        int a2= Integer.parseInt(args[2]);
        System.out.println(a2);
*/

        float f=Float.parseFloat(args[0]);
        System.out.println(f);

        String s=args[1];
        System.out.println(s);

        boolean b= Boolean.parseBoolean(args[2]);
        System.out.println(b);

    }
}
