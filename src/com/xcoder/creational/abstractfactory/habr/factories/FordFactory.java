package com.xcoder.creational.abstractfactory.habr.factories;

import com.xcoder.creational.abstractfactory.habr.cars.Coupe;
import com.xcoder.creational.abstractfactory.habr.cars.FordCoupe;
import com.xcoder.creational.abstractfactory.habr.cars.FordSedan;
import com.xcoder.creational.abstractfactory.habr.cars.Sedan;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
