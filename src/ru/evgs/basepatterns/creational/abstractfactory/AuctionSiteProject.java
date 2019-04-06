package ru.evgs.basepatterns.creational.abstractfactory;

import ru.evgs.basepatterns.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating action website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
