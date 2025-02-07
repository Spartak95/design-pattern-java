package com.xcoder.creational.abstractfactory.habr;

import com.xcoder.creational.abstractfactory.habr.factories.FordFactory;
import com.xcoder.creational.abstractfactory.habr.salon.CoupeSalon;
import com.xcoder.creational.abstractfactory.habr.salon.SedanSalon;

public class Demo {
    public static void main(String[] args) {
        CoupeSalon coupeSalon = new CoupeSalon(new FordFactory());
        coupeSalon.printBrandName();

        SedanSalon sedanSalon = new SedanSalon(new FordFactory());
        sedanSalon.printBrandName();
    }
}
