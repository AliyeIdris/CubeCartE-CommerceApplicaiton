package com.unitedcoder.collectiondatastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> a= new Stack<>(); //LIFO
        a.push("Book1");                     //Book4
        a.push("Book2");                     //Book3
        a.push("Book3");                     //Book2
        a.push("Book4");                     //Book1
        a.pop();  //remove the last element (top element) --Book4
        System.out.println(a);
        System.out.println(a.peek()); //look at the top element without removing it --Book3
        System.out.println(a.search("Book1")); //count from top to end
    }
}
