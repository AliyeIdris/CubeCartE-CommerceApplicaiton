package com.unitedcoder.loops;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        //1- 10 sum
        int sum =0;
        for (int i=1; i<=10; i++){
            sum +=i;
            System.out.println(String.format("i = %d, sum = %d",i,sum));
        }
        System.out.println("Total Sum: " +sum);
    }
}
