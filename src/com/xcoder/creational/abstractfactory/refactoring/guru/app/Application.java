package com.xcoder.creational.abstractfactory.refactoring.guru.app;

import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.Button;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.Checkbox;
import com.xcoder.creational.abstractfactory.refactoring.guru.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
