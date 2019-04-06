package ru.evgs.basepatterns.behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
         if (activity instanceof Sleep) {
             setActivity(new Coding());
         } else if (activity instanceof Coding) {
             setActivity(new Training());
         } else if (activity instanceof Training) {
             setActivity(new ReadingBooks());
         } else if (activity instanceof ReadingBooks) {
             setActivity(new Sleep());
         }
    }

    public void justDoIt() {
        activity.JustDoIt();
    }
}
