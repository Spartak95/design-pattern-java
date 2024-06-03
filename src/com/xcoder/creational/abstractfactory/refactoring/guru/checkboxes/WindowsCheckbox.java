package com.xcoder.creational.abstractfactory.refactoring.guru.checkboxes;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
