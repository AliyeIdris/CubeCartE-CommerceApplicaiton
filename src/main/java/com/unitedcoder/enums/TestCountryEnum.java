package com.unitedcoder.enums;

public class TestCountryEnum {
    public static void main(String[] args) {
        Country countryName1=Country.UK;
        System.out.println(countryName1.getDescription());
        Country countryName2=Country.UAE;
        System.out.println(countryName2.getDescription());
    }
}
