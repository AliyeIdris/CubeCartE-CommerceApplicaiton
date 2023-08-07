package com.unitedcoder.collectiondatastructure;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //array declaration

        int[] a= new int[]{54,43,11,76,57,98,76};

        //find mx number
        int maxNum=a[0];
        for(int i=0; i<a.length; i++){
            if (a[i]>maxNum){
                maxNum=a[i];
            }
        }
        System.out.println(maxNum);

        //find minimum number
        int minNum=a[0];
        for(int i=0; i<a.length; i++){
            if (a[i]<minNum){
                minNum =a[i];
            }
        }
        System.out.println(minNum);

    }
}
