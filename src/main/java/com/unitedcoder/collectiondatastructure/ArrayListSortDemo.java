package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSortDemo {
    public static void main(String[] args) {
        int[] a= {23,54,76,98,56,87,35};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //[23, 35, 54, 56, 76, 87, 98] after sort

        //reverse sort
        for(int i=a.length-1;i>=0; i--){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter length of an array:");
        int[] b= new int[scan.nextInt()];
        for (int i=0; i<b.length; i++){
            b[i]= (int)(Math.random()*100+1);
        }
        System.out.println("Before sorting: "+Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After Sorting: "+Arrays.toString(b));

    }
}
