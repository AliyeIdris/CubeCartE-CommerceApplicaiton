package com.unitedcoder.datetime;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormat;

import java.time.ZoneId;
import java.util.Set;


public class JodaDateTimeDemo {
    public static void main(String[] args) {
        DateTime time= new DateTime();
        System.out.println(time);

        DateTimeFormatter dateFormat= DateTimeFormat.forPattern("yyyy-MM-dd-hh:mm:ss:SS");
        System.out.println(time.toString(dateFormat));

        DateTimeFormatter dateFormat1= DateTimeFormat.forPattern("yyyy-MM-dd  hh:mm:ss:SS");
        System.out.println(time.toString(dateFormat1));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println(universalTime);

        DateTime urumqiTime= new DateTime(DateTimeZone.forID("Asia/Urumqi"));
        System.out.println(urumqiTime);

        Set<String> timeZones= ZoneId.getAvailableZoneIds();
        for(String Z: timeZones){
            System.out.println(Z);
        }
        DateTime centralCanada=new DateTime(DateTimeZone.forID("Canada/Central"));
        System.out.println(centralCanada);

        System.out.println(universalTime.getDayOfMonth()); //27
        System.out.println(universalTime.getMonthOfYear()); //5
        System.out.println(universalTime.getDayOfYear()); //147

        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsText());

        System.out.println(universalTime.plusMonths(5).dayOfWeek().getAsText());

        DateTime beginDateTime= new DateTime("2020-05-05");
        DateTime executionDateTime= new DateTime();
        Period period= new Period(beginDateTime,executionDateTime, PeriodType.days());
        System.out.println(period.getDays());

    }
}
