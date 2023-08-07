package com.unitedcoder.classconcepts.package2;

import com.unitedcoder.classconcepts.package1.Alpha;

public class AlphaSub extends Alpha{
    public static void main(String[] args) {
        Alpha alpha= new Alpha();
        alpha.alphaVersion="2.3"; //directly used public alphaVersion


        AlphaSub alphaSub=new AlphaSub();
        alphaSub.age=6;
        alphaSub.alphaVersion="2.3"; //inherited alphaVersion from Alpha class


        //in this class we can use public elements in Alpha class and protected elements via inheritance
    }
}
