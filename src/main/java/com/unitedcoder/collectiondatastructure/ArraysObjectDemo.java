package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[] a={12,54,67,87,54,87,43,26};
        int[] b={43,65,4,76,54,32,87,54};
        int[] c={12,54,67,87,54,87,43,26};

        //Arrays equals
        boolean result= Arrays.equals(a,b);
        System.out.println(result);
        boolean result1=Arrays.equals(a,c);
        System.out.println(result1);

        //copy of
        int[] d=Arrays.copyOf(b,5); //copy until 4th index
        System.out.println(Arrays.toString(d));
        int[] e=Arrays.copyOf(a,10); //copy all, set o rest of the elements
        System.out.println(Arrays.toString(e));

        //
        int[] f= new int[c.length];
        for (int i=0; i<c.length;i++){
            f[i]=c[i];
        }
        System.out.println(Arrays.toString(c));
        System.out.println((Arrays.toString(f)));

    }
}
