package ru.evgs.basepatterns.structural.bridge;

public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.printf("Bank system development is in progress...\n");
        developer.writeCode();
    }
}
