package com.unitedcoder.exceptionhandling;

public class Demo2 {

    //1. exception handling with try{} catch(){} method
    public void waitFunction(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //2.exception handling with throws method
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(3000); //checked exception


        //3. try{} finally{} method
        try{
            int[] array= new int[]{10,20,30,40};
            System.out.println(array[7]); //run time exception
        } finally { //finally always execute the code inside it in any circumstances
            System.out.println("Finally Block");

        }
    }

    //4. exception handling with if() else{} method
    public static void divideTwoNumbers(int x, int y) {
        System.out.println(x/y);
        if(y==0){
            System.out.println("Denominator cannot be zero");
        }

    }

}
