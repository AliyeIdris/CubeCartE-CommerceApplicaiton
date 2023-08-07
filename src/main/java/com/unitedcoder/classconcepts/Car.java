package com.unitedcoder.classconcepts;

public class Car implements Comparable<Car>{
    //state
    //behavior
    //class level variable
    private String brand;
    private String made;
    private int year;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String brand, String made, int year, double price, String color) {
        this.brand = brand;
        this.made = made;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public Car() { //Default Constructor
        System.out.println("Car Object was created....");
    }

    @Override
    public int compareTo(Car car) {
        if(price==car.price)
        return 0;
        else if(price>car.price)
            return 1;
        else
            return -1;
    }
}
