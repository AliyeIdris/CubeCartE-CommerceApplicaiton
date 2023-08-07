package com.unitedcoder.classconcepts;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        Car honda= new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setColor("Black");
        honda.setYear(2023);
        honda.setPrice(1000000);

        Car bmw= new Car();
        bmw.setBrand("BMW");
        bmw.setMade("Germany");
        bmw.setColor("White");
        bmw.setYear(2020);
        bmw.setPrice(125000);

        System.out.println(bmw.getPrice());
        System.out.println(bmw.getBrand());
        System.out.println(bmw);

        System.out.println(honda.getColor());

        ArrayList<Car> carList=new ArrayList<>();
        carList.add(honda);
        carList.add(bmw);
        for(Car car:carList){
            if (car.getBrand().equalsIgnoreCase("honda")){
                System.out.println(String.format("%s %s %s %s %s",
                      car.getBrand(),car.getMade(),car.getColor() ,car.getYear(),car.getPrice()));
            }
        }
    }

}
