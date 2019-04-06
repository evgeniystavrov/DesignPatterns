package ru.evgs.basepatterns.structural.bridge;

public class StockExchange extends Program {

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.printf("Stock exchange development is in progress...\n");
        developer.writeCode();
    }
}
