package ru.evgs.basepatterns.behavioral.command;

public class Datebase {
    public void incert() {
        System.out.println("Incerting record...");
    }

    public void update() {
        System.out.println("Updating record...");
    }

    public void select() {
        System.out.println("Reading record...");
    }

    public void delete() {
        System.out.println("Deleting record...");
    }
}
