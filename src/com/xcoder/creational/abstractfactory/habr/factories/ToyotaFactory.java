package com.xcoder.creational.abstractfactory.habr.factories;

import com.xcoder.creational.abstractfactory.habr.cars.Coupe;
import com.xcoder.creational.abstractfactory.habr.cars.Sedan;
import com.xcoder.creational.abstractfactory.habr.cars.ToyotaCoupe;
import com.xcoder.creational.abstractfactory.habr.cars.ToyotaSedan;

public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
