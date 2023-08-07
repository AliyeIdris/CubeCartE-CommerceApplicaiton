package com.unitedcoder.multithreading.amazonmultithreadingtest;

import com.unitedcoder.multithreading.amazonmultithreadingtest.AmazonFeatureThread;

public class AmazonSearchParallelTest {
    public static void main(String[] args) {
        Thread t1=new AmazonFeatureThread("chrome thread","chrome","Iphone 13 Case");
        Thread t2= new AmazonFeatureThread("safari thread","Safari","Iphone 14 Case");
        t1.start();
        t2.start();

        //or we can do
       /* String[] items={"Ipad","Iphone 14","Macbook Air M2"};
        for(int i=0; i<3; i++){
            new AmazonFeatureThread("safari thread","Safari",items[i]).start();
        }*/
    }
}
