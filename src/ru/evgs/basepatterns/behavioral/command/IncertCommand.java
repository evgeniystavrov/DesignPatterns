package ru.evgs.basepatterns.behavioral.command;

public class IncertCommand implements Command {
    Datebase datebase;

    public IncertCommand(Datebase datebase) {
        this.datebase = datebase;
    }

    @Override
    public void execute() {
        datebase.incert();
    }
}
