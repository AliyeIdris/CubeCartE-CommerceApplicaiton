package com.unitedcoder.datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class JavaDateTimeDemo {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);

        SimpleDateFormat dateFormat= new SimpleDateFormat();
        System.out.println(dateFormat); //print out hashcode by default
        System.out.println(dateFormat.format(date)); //print out with time

        SimpleDateFormat dateFormat1= new SimpleDateFormat("MM-dd-yyyy");
        System.out.println(dateFormat1.format(date)); //print with our format

        SimpleDateFormat dateFormat2= new SimpleDateFormat("d/M/yy");
        System.out.println(dateFormat2.format(date));

        SimpleDateFormat dateFormat3= new SimpleDateFormat("d/M/yy hh:mm:s:S"); //s: second, S:millisecond
        System.out.println(dateFormat3.format(date));

        LocalDateTime time=LocalDateTime.now();
        System.out.println(time.getYear());
        System.out.println(time.getDayOfWeek());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfYear());


        System.out.println(time.plusMonths(2));
        System.out.println(time.plusWeeks(3));
        System.out.println(time.plusYears(3));

        System.out.println(time.minusDays(20));

        System.out.println(time.plusYears(5).plusMonths(4).minusDays(10));
    }
}
