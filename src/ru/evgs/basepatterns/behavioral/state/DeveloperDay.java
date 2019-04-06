package ru.evgs.basepatterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Developer developer = new Developer();
        
        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }
    }
}
