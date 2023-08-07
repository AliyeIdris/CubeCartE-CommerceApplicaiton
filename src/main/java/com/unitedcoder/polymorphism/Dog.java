package com.unitedcoder.polymorphism;

public class Dog extends Animal{
    public void displayInfo(){
        System.out.println("I'm a dog");
    }

    public void running(){
        System.out.println("dog is running");
    }

    public void eating(){
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.displayInfo();
        dog.running();

        Animal dog1= new Animal();
        dog1.displayInfo();

        Animal dog2= new Dog();
        dog2.displayInfo();

    }

}
