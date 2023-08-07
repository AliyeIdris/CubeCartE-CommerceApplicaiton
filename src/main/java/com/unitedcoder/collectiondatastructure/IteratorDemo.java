package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        Iterator<Integer> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
