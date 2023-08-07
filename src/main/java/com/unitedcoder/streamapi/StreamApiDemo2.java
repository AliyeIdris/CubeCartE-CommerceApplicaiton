package com.unitedcoder.streamapi;

import com.unitedcoder.classconcepts.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Japan", 2023, 60000, "Red"));
        cars.add( new Car("BMW", "Germany", 2000, 100000, "Grey"));
        cars.add( new Car("BMW", "Germany", 2023, 30000, "Black"));
        cars.add(new Car("KIA", "Japan", 2021, 40000, "Red"));
        cars.add(new Car("Ford", "USA", 2019, 65000, "Silver"));

        List<Car> priceFiltered=cars.stream().filter(p->p.getPrice()>40000).collect(Collectors.toList());
        System.out.println(priceFiltered);

        List<Double> priceList=cars.stream().filter(p->p.getPrice()>30000).map(p->p.getPrice())
                .collect(Collectors.toList());
        System.out.println(priceList);

        //sort
        List<Car> sortedCarList=cars.stream().sorted(Comparator.comparing(Car::getYear)).collect(Collectors.toList());
        System.out.println(sortedCarList);
    }

}
