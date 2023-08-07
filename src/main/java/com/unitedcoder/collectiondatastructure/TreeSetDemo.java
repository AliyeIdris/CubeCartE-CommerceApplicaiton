package com.unitedcoder.collectiondatastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1= new HashSet<>();
        set1.add(10);
        set1.add(12);
        set1.add(35);
        set1.add(10);
        set1.add(13);
        System.out.println(set1); //doesn't maintain insertion order

        Set<Integer> set2= new LinkedHashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(50);
        set2.add(80);
        set2.add(500);
        System.out.println(set2); //maintains insertion order

        Set<Integer> set3= new TreeSet<>();
        set3.add(60);
        set3.add(40);
        set3.add(20);
        set3.add(90);
        set3.add(260);
        System.out.println(set3); //Ascending order
    }
}
