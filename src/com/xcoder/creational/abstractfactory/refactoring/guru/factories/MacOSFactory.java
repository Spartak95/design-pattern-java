package com.xcoder.creational.abstractfactory.refactoring.guru.factories;

import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.Button;
import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.MacOSButton;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.Checkbox;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
