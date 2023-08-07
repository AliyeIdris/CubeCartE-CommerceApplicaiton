package com.unitedcoder.multithreading.demotest;

public class Line {

    public synchronized void getLine(){ //to achieve thread safety, we make method to be synchronized
        for(int i=0;i<3;i++){
            System.out.println(i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
