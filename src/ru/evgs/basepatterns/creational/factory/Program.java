package ru.evgs.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        // creating link to object JavaDeveloperFactory
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        // calling method createDeveloper
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "is unknown speciality!");
        }
    }
}
