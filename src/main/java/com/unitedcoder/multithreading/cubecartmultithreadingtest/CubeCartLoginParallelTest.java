package com.unitedcoder.multithreading.cubecartmultithreadingtest;

public class CubeCartLoginParallelTest {
    public static void main(String[] args) {
        Thread t1=new CubeCartFeatureThread("test1","chrome",
                "testautomation1","automation123!");
        Thread t2=new CubeCartFeatureThread("test2","chrome",
                "testautomation1","automation123!");
        //t1.start();
        //t2.start();

        //or we can do with for loop
        for(int i=1; i<3; i++){
            new CubeCartFeatureThread("test"+i,"chrome",
                    "testautomation1","automation123!").start();
        }


    }
}
