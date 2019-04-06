package ru.evgs.basepatterns.structural.bridge;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.printf("Writes Cpp code...");
    }
}
