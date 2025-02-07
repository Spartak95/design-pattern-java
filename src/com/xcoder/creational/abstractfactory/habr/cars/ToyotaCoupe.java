package com.xcoder.creational.abstractfactory.habr.cars;

public class ToyotaCoupe implements Coupe {
    public ToyotaCoupe() {
        System.out.println("Create Toyota Coupe");
    }

    @Override
    public String getBrandName() {
        return "Toyota Coupe";
    }
}
