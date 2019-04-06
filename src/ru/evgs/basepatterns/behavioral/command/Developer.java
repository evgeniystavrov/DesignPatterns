package ru.evgs.basepatterns.behavioral.command;

public class Developer {
    Command incert;
    Command update;
    Command select;
    Command delete;

    public Developer(Command incert, Command update, Command select, Command delete) {
        this.incert = incert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void incertRecord() {
        incert.execute();
    }

    public void updateRecord() {
        update.execute();
    }

    public void selectRecoed() {
        select.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }
}
