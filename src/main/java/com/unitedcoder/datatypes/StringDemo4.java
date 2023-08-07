package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

public class StringDemo4 {
    //StringUtlis
    public static void main(String[] args) {

        //Reverse String
        String schoolName="United Coder";
        System.out.println(StringUtils.reverse(schoolName));

        String s1="I am learning Java";
        System.out.println(StringUtils.reverse(s1));


        //count
        String s2 = "dhfkjdfjbdjfdjfbdjkfbjdbfj";
        System.out.println(StringUtils.countMatches(s2,'b'));

        //rotate last characters to the beginning
        System.out.println(StringUtils.rotate(s1,4));
        System.out.println(StringUtils.rotate(s1,13));

        //get common prefix
        System.out.println(StringUtils.getCommonPrefix("alim tohti", "alim dilshat", "alim adil"));

        //
        String s3 = "alim dilshat";
        String s4 = "alim tohti";
        System.out.println(StringUtils.difference(s3,s4));
    }
}
