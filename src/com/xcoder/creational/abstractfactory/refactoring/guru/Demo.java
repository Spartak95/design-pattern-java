package com.xcoder.creational.abstractfactory.refactoring.guru;

import com.xcoder.creational.abstractfactory.refactoring.guru.app.Application;
import com.xcoder.creational.abstractfactory.refactoring.guru.factories.GUIFactory;
import com.xcoder.creational.abstractfactory.refactoring.guru.factories.MacOSFactory;

public class Demo {
    public static void main(String[] args) {
        GUIFactory factory = new MacOSFactory();
        Application application = new Application(factory);
        application.paint();
    }
}
