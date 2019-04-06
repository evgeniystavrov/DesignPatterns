package ru.evgs.basepatterns.creational.abstractfactory.banking;

import ru.evgs.basepatterns.creational.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tests banking code...");
    }
}
