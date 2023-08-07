package com.unitedcoder.classconcepts;

import java.util.*;

public class SortMultipleObjects {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(100,900,300,50,340,230);
        Collections.sort(list);
        //System.out.println(list);
        List<String> list2=Arrays.asList("Hakan","Aliye","Hilal","Büşra","Canan","Tahir");
       Collections.sort(list2);
        //System.out.println(list2);

        List<Car> cars=new ArrayList<>();
        Car car1= new Car("Toyota","Japan",2023,60000,"Black");
        Car car2= new Car("BMW", "Germany",2000,100000,"Grey");
        Car car3= new Car("Tesla","USA",2023,80000,"White");
        Car car4= new Car("KIA","Japan",2021,40000,"Red");
        Car car5= new Car("Ford","USA",2019,65000,"Silver");
        cars.addAll(Arrays.asList(car1,car2,car3,car4,car5));
        cars.sort(Comparator.comparing(Car::getPrice));
        //System.out.println(cars);
        cars.sort(Comparator.comparing(Car::getBrand));
        //System.out.println(cars);
        cars.sort(Comparator.comparing(Car::getYear).reversed());
        //System.out.println(cars);

        //after implements Comparable Interface
        Collections.sort(cars);
        System.out.println(cars);



    }
}
