package com.unitedcoder.multithreading.demotest;

public class Train extends Thread {
    Line line;

    public Train(Line line) {
        this.line = line;
    }

    public void run(){
        line.getLine();
    }
}
