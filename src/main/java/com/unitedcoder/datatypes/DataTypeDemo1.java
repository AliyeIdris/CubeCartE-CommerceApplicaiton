package com.unitedcoder.datatypes;

public class DataTypeDemo1 {
    public static void main(String[] args) {
        //Primitive data types
        //byte, short, int, long, double, float, char, boolean
        byte a = 10; //-128 to 127
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        byte b=20;
        byte c = (byte) (a+b);
        int d= a+b;
        System.out.println(c);
        System.out.println(d);

        System.out.println(String.format("Print %d + %d = %d",a,b,a+c));

        //short
        short s= 10000;
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Short.MIN_VALUE);//-32768
        
        //int
        int i=3;
        System.out.println("Max value of the integer is "+Integer.MAX_VALUE);
        System.out.println("Min value of the integer is "+Integer.MIN_VALUE);

        //long
        long l = 4;
        System.out.println("Max value of the long is "+Long.MAX_VALUE);
        System.out.println("Min value of the long is "+Long.MIN_VALUE);

        //float
        float f=6;
        System.out.println(f);
        System.out.println("Max value of the float is "+Float.MAX_VALUE);
        System.out.println("Min value of the float is "+Float.MIN_VALUE);

        //non numeric data type
        //boolean =yes/no; true/false

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);

        char t='A';
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }

}
