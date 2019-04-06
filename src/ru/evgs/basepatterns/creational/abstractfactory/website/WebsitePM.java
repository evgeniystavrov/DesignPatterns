package ru.evgs.basepatterns.creational.abstractfactory.website;

import ru.evgs.basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manage project...");
    }
}
