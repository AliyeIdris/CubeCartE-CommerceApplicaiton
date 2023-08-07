package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArrayFillDemo {
    public static void main(String[] args) {
        int[] a=new int[4]; //declaration
        Arrays.fill(a,10);
        System.out.println(Arrays.toString(a));

        int[] b={12,34,65,87,9,5476,45};
        Arrays.fill(b,4);
    }
}
