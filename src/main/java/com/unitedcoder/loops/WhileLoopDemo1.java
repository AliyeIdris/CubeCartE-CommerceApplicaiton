package com.unitedcoder.loops;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        int a=0;
        while(a<3){
            ++a;
            a++;
            System.out.println(a);
        }
        System.out.println("outside while loop");
        System.out.println(a);
    }
}
