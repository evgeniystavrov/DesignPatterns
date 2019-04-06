package ru.evgs.basepatterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Datebase datebase = new Datebase();

        Developer developer = new Developer(
                new IncertCommand(datebase),
                new UpdateCommand(datebase),
                new SelectCommand(datebase),
                new DeleteCommand(datebase)
        );

        developer.incertRecord();
        developer.updateRecord();
        developer.selectRecoed();
        developer.deleteRecord();
    }
}
