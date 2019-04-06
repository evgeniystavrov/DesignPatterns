package ru.evgs.basepatterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void JustDoIt() {
        System.out.println("Sleeping...");
    }
}
