package com.unitedcoder.datatypes;

import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        int a =100;
        int b=50;

        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(b-a));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.pow(8,5));
        System.out.println(Math.sqrt(81));

        //Random         0.0 - 0.9999999999999999 <1
        System.out.println(Math.random());
        System.out.println((int)Math.random());


        // 0-10
        int randomNumber=(int)((Math.random()*10)+1); //formül 1 i saymadığı için biz ekliyoruz
        System.out.println(randomNumber);

        //Formulation:
        // int variableName=(int)(Math.random()*Max-Min +1) + min);
        //0-100
        int v= (int)(Math.random()*(100-0 +1) +0);
        System.out.println(v);

        // 34-155
        int g= (int)(Math.random()*(155-34 +1) +34); // (155-34+1) 34 ile 155 arasında kaç tane sayı olduğunu verir, 34 den başlamasını istediğimiz için +34 yapıyoruz
        System.out.println(g);

        //Random Class
        Random random=new Random();
        int randomNumber1=random.nextInt(11)+10; // 10-20
        System.out.println(randomNumber1);

    }
}
