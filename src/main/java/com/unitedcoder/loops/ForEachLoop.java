package com.unitedcoder.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        int a=0;
        //for loop
        for (int i=0; i<3;i++){
            System.out.print(args[i] +"    ");
            a=Integer.parseInt(args[i]);

        }
        System.out.println();
        System.out.println(a);

        System.out.println("*******************");
        //foreach loop

        for ( String b: args) {
            System.out.println(b);

        }
    }
}
