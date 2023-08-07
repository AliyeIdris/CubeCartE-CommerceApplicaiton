package com.unitedcoder.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApiDemo3 {
    public static void main(String[] args) {
        //count()
        List<Integer> list= Arrays.asList(2,20,30,10,6,300,45,67,33,21);
        long evenNumberCount=list.stream().filter(i->i%2==0).count();
        System.out.println(evenNumberCount);

        //max()
        Optional<Integer> maxNum=list.stream().max(Integer::compareTo);
        System.out.println(maxNum.get());

        //min()
        Optional<Integer> minNum=list.stream().min(Integer::compareTo);
        System.out.println(minNum.get());

    }
}
