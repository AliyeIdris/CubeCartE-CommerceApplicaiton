package com.unitedcoder.collectiondatastructure;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.addLast(40);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(30);
        System.out.println(linkedList);
        //addFirst() addLast() only effect the list before it, if we continue the code with different commands, it doesnt effect them
    }
}
