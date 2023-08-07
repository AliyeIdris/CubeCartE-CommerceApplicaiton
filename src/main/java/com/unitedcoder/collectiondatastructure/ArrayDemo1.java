package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int a ; //declaration
        a = 5 ; //assignment
        int aa = 5 ;  //inti

        // declaration
        int[] b ;
        String[] c ;
        boolean[] d ;
        short[] f;
        long[] g ;
        double[] r;
        float [] u;
        byte[] h;
        char[] j;

        int[] arr = new int[6];
        arr[0] = 10;            arr[1] = 20;           arr[2] = 30;
        arr[3] = 40;            arr[4] = 50;           arr[5] = 60;   // length == 6

        System.out.println(arr[1]);
        System.out.println(arr[5]);
        System.out.println(arr.length);

        // for loop
        System.out.println("*************************");
        for (int i = 0; i <= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++");
        // for each loop
        for (int a2:arr){
            System.out.print(a2+" ");
        }
    }
}
