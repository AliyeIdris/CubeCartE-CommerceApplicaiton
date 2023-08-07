package com.unitedcoder.exceptionhandling;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Add customer");
        String s="100";
        try{
            int[] array= new int[]{10,20,30,40};
            System.out.println(array[7]); //run time exception
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();

        }

        System.out.println("Add Product");

    }

}
