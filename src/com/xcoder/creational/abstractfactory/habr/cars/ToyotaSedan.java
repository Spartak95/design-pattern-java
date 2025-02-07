package com.xcoder.creational.abstractfactory.habr.cars;

public class ToyotaSedan implements Sedan {
    public ToyotaSedan() {
        System.out.println("Create Toyota Sedan");
    }

    @Override
    public String getBrandName() {
        return "Toyota Sedan";
    }
}
