package com.unitedcoder.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapDemo {
    public static void main(String[] args) {
        //map
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> list=list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list);

        //flatmap
        List<Integer> list2=Arrays.asList(1,2);
        List<Integer> list3=Arrays.asList(3,4);
        List<Integer> list4=Arrays.asList(5,6);
        List<List<Integer>> finalList=Arrays.asList(list2,list3,list4);
        List<Integer> finalResult=finalList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(finalResult);

    }
}
