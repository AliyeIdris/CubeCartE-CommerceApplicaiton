package com.unitedcoder.abstractiontutorial;

public abstract class Bank {
    //variables
    String bankName;
    final int a= 100;
    static int x=300;
    static  final int y= 900;

    //method -abstract and non-abstract
    public abstract void mortgage(); //abstract method

    public void credit(){ //non-abstract method
        System.out.println("Bank Credit ....");
    }
}
