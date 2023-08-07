package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class DataTypeConversion2 {
    public static void main(String[] args) {

        //convert numeric String to primitive data type
        String a = "123456ABC";
        System.out.println(StringUtils.isNumeric(a));
        a=a.replace("ABC","");
        System.out.println(a);
        System.out.println(StringUtils.isNumeric(a));
        int a1=Integer.parseInt(a);
        System.out.println(a1);

        String b="123";
        byte b1=Byte.parseByte(b);
        System.out.println(b1);

        //Convert primitive data type to String
        int c=2023;
        int c1=0413;
        String c2=String.valueOf(c);
        System.out.println(c);
        String c3 =String.valueOf(c1);
        System.out.println(c3);

        //Convert primitive data type to Boolean
        String f="true";
        boolean b2= Boolean.parseBoolean(f);
        System.out.println(b2);

    }

}
