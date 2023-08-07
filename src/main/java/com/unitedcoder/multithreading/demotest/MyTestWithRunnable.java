package com.unitedcoder.multithreading.demotest;

public class MyTestWithRunnable implements Runnable{
    private int threadNumber;

    public MyTestWithRunnable(int threadNumber) {
        this.threadNumber=threadNumber;
    }

    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(i+" from thread "+threadNumber);
            if(threadNumber==2){
                throw new RuntimeException(); //this exception doesn't affect rest of the thread to be executed
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
