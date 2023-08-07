package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysSplitDemo {
    public static void main(String[] args) {

        String a="Java_tutorial";
        String[] b=a.split("_");
        System.out.println(Arrays.toString(b));

        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }
}
