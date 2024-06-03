package com.xcoder.creational.abstractfactory.habr.factories;

import com.xcoder.creational.abstractfactory.habr.cars.Coupe;
import com.xcoder.creational.abstractfactory.habr.cars.Sedan;

public interface CarsFactory {
    Sedan createSedan();
    Coupe createCoupe();
}
