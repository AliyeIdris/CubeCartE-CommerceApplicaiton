package com.unitedcoder.classconcepts.package1;

public class Alpha {
    public static void main(String[] args) {
        Alpha alpha= new Alpha();
        alpha.age=5;
        alpha.alphaVersion="3.0";
        alpha.alphaInfo="info";
        alpha.year=2023;

    }

    private String alphaInfo;
    public String alphaVersion;

    protected int age;



    int year;

    public Alpha() {

    }

    protected void getAge(){
        System.out.println(age);
    }

    public Alpha(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }

    public String getAlphaInfo() {
        return alphaInfo;
    }

    public void setAlphaInfo(String alphaInfo) {
        this.alphaInfo = alphaInfo;
    }
}
