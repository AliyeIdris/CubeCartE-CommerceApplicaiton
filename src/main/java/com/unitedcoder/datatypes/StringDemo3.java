package com.unitedcoder.datatypes;

public class StringDemo3 {
    public static void main(String[] args) {
        //city,state,zipcode
        String cityName="Columbia";
        String state="Maryland";
        String zipCode="21046";

        //+ is for joining string together or concatenate string
        System.out.println("I live in ");
        System.out.println(cityName+ " "+state+" "+zipCode);
        System.out.println("I live in ");
        System.out.println(cityName.concat(" ").concat(state).concat(" ").concat(zipCode));

        //toUpperCase
        System.out.println(cityName.toUpperCase());

        //toLowerCase
        System.out.println(cityName.toLowerCase());

        //length
        String s1="United Coder";
        System.out.println("Length of the string s1 is: "+s1.length());

        //index
        System.out.println(s1.indexOf('e'));
        System.out.println(s1.indexOf("C"));
        System.out.println(s1.indexOf("d"));
        System.out.println(s1.lastIndexOf('d'));

        //contains
        System.out.println(s1.contains("Coder"));//true
        System.out.println(s1.contains("coder"));//false

        //replace
        String s4="Learning Java is fan";
        System.out.println(s4.replace("Java","Python"));

        //trim
        String s5="      Java        ";
        System.out.println(s5);
        System.out.println(s5.trim());

        //substring
        System.out.println(s4.substring(0,5));
        System.out.println(s4.substring(3));

        //compare two string
        String s7="United Coder";
        String s8="united coder";
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));

    }
}
