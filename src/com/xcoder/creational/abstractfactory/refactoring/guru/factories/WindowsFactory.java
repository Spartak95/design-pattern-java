package com.xcoder.creational.abstractfactory.refactoring.guru.factories;

import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.Button;
import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.WindowsButton;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.Checkbox;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
