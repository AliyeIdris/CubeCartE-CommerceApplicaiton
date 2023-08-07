package com.unitedcoder.multithreading;

public class Counter extends Thread{
    int count;

    public synchronized void increment(){
        count++;
    }

    @Override
    public void run(){

        for (int i=1; i<=1000; i++){
            increment();

        }
        System.out.println("Count "+ count);
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter= new Counter();
        Thread t1= new Counter();
        t1.start();
        t1.join();
        //Counter counter1=new Counter();
        Thread t2= new Counter();
        t2.start();
        t2.join();
        System.out.println(counter.count);
    }
}
