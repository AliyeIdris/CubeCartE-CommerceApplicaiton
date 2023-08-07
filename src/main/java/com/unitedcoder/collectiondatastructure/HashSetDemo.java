package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1= new HashSet<>();
        set1.add(10);
        set1.add(50);
        set1.add(10);
        set1.add(70);
        set1.add(18);
        set1.add(80);
        System.out.println(set1); //doesn't accept duplicate value, //order based on hashcode

        LinkedList<Integer> b=new LinkedList<>();
        b.add(30);
        b.add(45);
        b.add(65);
        b.add(45);
        b.add(27);
        System.out.println(b); //LinkedList accepts duplicate value


    }
}
