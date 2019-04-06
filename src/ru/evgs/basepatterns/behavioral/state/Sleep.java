package ru.evgs.basepatterns.behavioral.state;

public class Sleep implements Activity {
    @Override
    public void JustDoIt() {
        System.out.println("Sleeping...");
    }
}
