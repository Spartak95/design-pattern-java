package com.xcoder.creational.abstractfactory.habr.cars;

public class FordCoupe implements Coupe {
    public FordCoupe() {
        System.out.println("Create Ford Coupe");
    }

    @Override
    public String getBrandName() {
        return "Ford Coupe";
    }
}
