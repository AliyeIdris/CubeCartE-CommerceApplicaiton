package com.unitedcoder.collectiondatastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int aa; //declaration
        aa=5; //assignment
        int aa1=5; //initialization

        int[] a= new int[]{12,65,43,65,49,98,65};
        int[] b= new int[]{4432,54,432,765,435};
        System.out.println(a[3]);
        System.out.println(b[0]);

        int sum=0;
        for( int i=0; i<a.length; i++){
            sum +=a[i];
            System.out.printf("%s element is %s%n",i,a[i]);
        }
        System.out.println(String.format("sum of array elements is: %s",sum));

        int sum1=0;
         for(int n:b){
             System.out.print(n+" ");
             sum1 +=n;
         }
        System.out.println();
        System.out.println(sum1);
    }
}
