package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] a={12,43,766,54,43,98,76,54,98,9};
        for(int i=0; i<a.length-1; i++){
            for(int j=0;j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    int emptyPlate=a[j];
                    a[j]=a[j+1];
                    a[j+1]=emptyPlate;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
