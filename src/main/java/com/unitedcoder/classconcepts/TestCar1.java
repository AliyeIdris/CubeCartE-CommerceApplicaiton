package com.unitedcoder.classconcepts;

public class TestCar1 {
    public static void main(String[] args) {
        Car[] cars= new Car[2];
        Car car1= new Car("Toyota","Japan",2023,60000,"Red");
        Car car2= new Car("BMW", "Germany",2000,100000,"Grey");
        cars[0]=car1;
        cars[1]=car2;

        for(Car car:cars){
            System.out.println(car.getBrand());
            System.out.println(car.getPrice());
        }
Car[] cars1= new Car[3];
        Car car3= new Car("BMW","Germany",2023,30000,"Black");
        Car car4= new Car("KIA","Japan",2021,40000,"Red");
        Car car5= new Car("Ford","USA",2019,65000,"Silver");
        cars1[0]= car3;
        cars1[1]= car4;
        cars1[2]=car5;

        for(Car car:cars1){
            System.out.println(car.getBrand()+" "+car.getColor()+" "+car.getPrice()+" "+car.getYear());
        }


    }
}
