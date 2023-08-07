package com.unitedcoder.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsOfStream {
    public static void main(String[] args) {

        //distinct
        List<String> vehicles = Arrays.asList("Car", "Bus", "Bike", "Car", "Bike","Bike");
        List<String> distinctVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);

        //limit
        List<String> limitedList=vehicles.stream().limit(4).collect(Collectors.toList());
        System.out.println(limitedList);

        //allMatch
        boolean allMatch=vehicles.stream().allMatch(s->s.equals("Bike"));
        System.out.println(allMatch);

        //anyMatch
        boolean anyMatch=vehicles.stream().anyMatch(s->s.equals("Bike"));
        System.out.println(anyMatch);

        //noneMatch
        boolean noneMatch=vehicles.stream().noneMatch(s->s.equals("Bom"));
        System.out.println(noneMatch);
    }
}
