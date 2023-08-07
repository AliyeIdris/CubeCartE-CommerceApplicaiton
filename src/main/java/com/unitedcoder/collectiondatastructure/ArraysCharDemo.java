package com.unitedcoder.collectiondatastructure;

public class ArraysCharDemo {
    public static void main(String[] args) {
        String school="United Coder";
        char[] a=new char[school.length()];
        for(int i=0; i<school.length(); i++){
            a[i]=school.charAt(i);
            System.out.print(a[i]+", ");
        }
    }
}
