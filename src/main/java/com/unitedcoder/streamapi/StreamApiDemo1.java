package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 15, 40, 45, 67, 200);
       /* for(int i:list){
            if(i%2==0)
                System.out.println(i);
        }*/

        //filter
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
        List<String> countries = Arrays.asList("Netherland", "Canada", "Turkey", "Japan");
        countries.stream().filter(n -> n.length() > 4 && n.length() < 7).forEach(System.out::println);
        List<String> filteredCountries = countries.stream().filter(n -> n.length() > 4 && n.length() < 7).collect(Collectors.toList());
        System.out.println(filteredCountries);

        //sort
        List<String> sortedList = countries.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        sortedList=countries.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
    }

}
