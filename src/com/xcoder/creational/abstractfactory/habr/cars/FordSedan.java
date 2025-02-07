package com.xcoder.creational.abstractfactory.habr.cars;

public class FordSedan implements Sedan {
    public FordSedan() {
        System.out.println("Create Ford Sedan");
    }

    @Override
    public String getBrandName() {
        return "Ford Sedan";
    }
}
