package com.xcoder.creational.abstractfactory.habr.salon;

import com.xcoder.creational.abstractfactory.habr.cars.Sedan;
import com.xcoder.creational.abstractfactory.habr.factories.CarsFactory;

public class SedanSalon {
    private final Sedan sedan;

    public SedanSalon(CarsFactory carsFactory) {
        this.sedan = carsFactory.createSedan();
    }

    public void printBrandName() {
        System.out.println("Brand: " + sedan.getBrandName());
    }
}
