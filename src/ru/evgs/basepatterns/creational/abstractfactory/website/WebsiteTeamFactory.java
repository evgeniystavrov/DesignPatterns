package ru.evgs.basepatterns.creational.abstractfactory.website;

import ru.evgs.basepatterns.creational.abstractfactory.Developer;
import ru.evgs.basepatterns.creational.abstractfactory.ProjectManager;
import ru.evgs.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import ru.evgs.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
