package com.unitedcoder.multithreading.amazonmultithreadingtest;

public class AmazonFeatureThread extends Thread{
    public String browserName;
    public String item;
    AmazonPage amazonPage;

    public AmazonFeatureThread(String threadName,String browserName,String item) {
        super(threadName);
        this.browserName = browserName;
        this.item=item;
        amazonPage=new AmazonPage();
    }

    @Override
    public void run(){
        System.out.println("Thread--Started "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            amazonPage.setup(this.browserName);
            amazonPage.amazonSearchTest(this.item);
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            amazonPage.tearDown();
        }
        System.out.println("Tread--Ended "+Thread.currentThread().getName());

    }
}
