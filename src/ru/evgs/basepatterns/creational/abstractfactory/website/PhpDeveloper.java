package ru.evgs.basepatterns.creational.abstractfactory.website;

import ru.evgs.basepatterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Writes php code...");
    }
}
