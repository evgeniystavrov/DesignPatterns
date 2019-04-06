package ru.evgs.basepatterns.creational.abstractfactory.banking;

import ru.evgs.basepatterns.creational.abstractfactory.Developer;
import ru.evgs.basepatterns.creational.abstractfactory.ProjectManager;
import ru.evgs.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import ru.evgs.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
