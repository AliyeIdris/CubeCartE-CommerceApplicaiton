package com.unitedcoder.multithreading.demotest;

import com.unitedcoder.multithreading.demotest.MyTestWithRunnable;

public class TestMyRunnable {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            MyTestWithRunnable myTest = new MyTestWithRunnable(i);
//because of MyTestWithRunnable class implements Runnable interface, we cannot directly apply start() method to the object
//we should create a new object from Thread class, then invoke myTest to this object, then apply start() method to the object
            Thread t= new Thread(myTest);
            t.start();
        }

    }
}
