package com.xcoder.creational.abstractfactory.habr.salon;

import com.xcoder.creational.abstractfactory.habr.cars.Coupe;
import com.xcoder.creational.abstractfactory.habr.factories.CarsFactory;

public class CoupeSalon {
    private final Coupe coupe;

    public CoupeSalon(CarsFactory carsFactory) {
        this.coupe = carsFactory.createCoupe();
    }

    public void printBrandName() {
        System.out.println("Brand: " + coupe.getBrandName());
    }
}
