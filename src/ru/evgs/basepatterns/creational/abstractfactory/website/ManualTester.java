package ru.evgs.basepatterns.creational.abstractfactory.website;

import ru.evgs.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Testing site...");
    }
}
