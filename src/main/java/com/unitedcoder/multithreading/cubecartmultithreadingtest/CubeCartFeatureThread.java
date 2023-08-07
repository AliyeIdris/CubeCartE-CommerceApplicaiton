package com.unitedcoder.multithreading.cubecartmultithreadingtest;

import com.unitedcoder.multithreading.amazonmultithreadingtest.AmazonPage;

public class CubeCartFeatureThread extends Thread{
    public String browserName;
    public String userName;
    public String password;
    CubeCartLoginTestPage loginTestPage;

    public CubeCartFeatureThread(String threadName, String browserName, String userName, String password) {
        super(threadName);
        this.browserName = browserName;
        this.userName=userName;
        this.password= password;
        loginTestPage= new CubeCartLoginTestPage();
    }

    @Override
    public void run(){
        System.out.println("Thread--Started "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            loginTestPage.setup(this.browserName);
            loginTestPage.login(this.userName,this.password);
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            loginTestPage.tearDown();
            System.out.println("Tread--Ended "+Thread.currentThread().getName());
        }

    }
}
