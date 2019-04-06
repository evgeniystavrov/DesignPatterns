package ru.evgs.basepatterns.creational.abstractfactory.banking;

import ru.evgs.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writing Java code...");
    }
}
