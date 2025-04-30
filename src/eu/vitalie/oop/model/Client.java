package eu.vitalie.oop.model;

import java.util.Random;

public class Client extends Person {

    private String uuid;

    public Client(String name, String surname, int age, String uuid) {
        super(name, surname, age);
        this.uuid = uuid;
        this.trustLevel = new Random().nextInt();
    }

    public String getUuid() {

        return uuid;
    }

    @Override
    public String toString() {
        return super.toString() + " and UUID " + this.uuid;
    }

    @Override
    public void doSomething() {
        System.out.println("========");
        System.out.println("This is client");
        super.doSomething();

    }
}
