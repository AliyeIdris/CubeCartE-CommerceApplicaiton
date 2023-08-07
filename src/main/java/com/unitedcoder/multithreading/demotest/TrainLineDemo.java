package com.unitedcoder.multithreading.demotest;
public class TrainLineDemo {
    public static void main(String[] args) {
        Line l=new Line();
        Train train1=new Train(l);
        Train train2=new Train(l);
        train1.start();
        train2.start();
    }
}
