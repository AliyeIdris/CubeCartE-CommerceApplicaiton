package com.unitedcoder.multithreading.demotest;

import com.unitedcoder.multithreading.demotest.MyTestWithThread;

public class TestMyThread{
    public static void main(String[] args) {
        for(int i=1; i<=4; i++) {
            MyTestWithThread myTest = new MyTestWithThread(i);
            myTest.start();
        }

    }
}
