package com.unitedcoder.collectiondatastructure;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] b;
        String[] c;
        boolean[] d;
        short[] f;
        long[] g;
        double[] r;
        float[] u;
        byte[] h;
        char[] j;

        Object a[] =new Object[5]; //Object can contain different types of data
        a[0] =10; //int
        a[1] =20.55; //float
        a[2]= "Welcome"; //string
        a[3]= 'F'; //char
        a[4] =true; //boolean

        for (Object i :a){
            System.out.println(i);
        }
    }
}
