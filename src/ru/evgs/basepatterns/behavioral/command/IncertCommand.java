package ru.evgs.basepatterns.behavioral.command;

public class IncertCommand implements Command {
    Database database;

    public IncertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.incert();
    }
}
