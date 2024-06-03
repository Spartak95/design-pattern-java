package com.xcoder.creational.abstractfactory.refactoring.guru.factories;

import com.xcoder.creational.abstractfactory.refactoring.guru.buttons.Button;
import com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
