package ru.evgs.basepatterns.structural.facade;

public class Developer {
    public void doJobBeforDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading habrahabr...");
        }
    }
}
