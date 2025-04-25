package eu.vitalie.oop.model;

import java.util.Random;

public class Person {

    private static final int MINIMUM_TRUST_LEVEL = 100;
    private  String name;
    private final String surname;
    private final int age;
    private final int trustLevel;



    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.trustLevel = new Random().
                nextInt(MINIMUM_TRUST_LEVEL + MINIMUM_TRUST_LEVEL);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        this.name = name;
    }



    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isTrusted() {
        return this.trustLevel > MINIMUM_TRUST_LEVEL;
    }
}
