package ru.evgs.basepatterns.creational.abstractfactory.banking;

import ru.evgs.basepatterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manages banking project...");
    }
}
