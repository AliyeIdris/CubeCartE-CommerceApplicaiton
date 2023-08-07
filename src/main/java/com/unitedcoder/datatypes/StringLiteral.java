package com.unitedcoder.datatypes;

public class StringLiteral {
    public static void main(String[] args){
        //define a string variable
        //literal
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);

        //object
        String a= new String("abc");
        String b= new String("abc");
        System.out.println(a==b);

    }
}
