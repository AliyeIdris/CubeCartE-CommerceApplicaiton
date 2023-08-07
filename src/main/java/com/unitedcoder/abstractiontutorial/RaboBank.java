package com.unitedcoder.abstractiontutorial;

public class RaboBank extends Bank implements USBank,UKBank{
    @Override
    public void mortgage() {
        System.out.println("Mortgage...");
    }

    public void monetTransfer(){

    }

    @Override
    public void loan1() {

    }

    @Override
    public void credit1() {

    }

    @Override
    public void transaction1() {

    }

    @Override
    public void loan() {

    }

    @Override
    public void transaction() {

    }
}
