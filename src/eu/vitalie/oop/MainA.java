package eu.vitalie.oop;

import eu.vitalie.oop.model.Client;
import eu.vitalie.oop.model.Person;

import java.awt.*;
import java.util.Random;

public class MainA {
    public static void main(String[] args) {/*
        Person person = new Person("Andrei", "Zare", 23);
        person.doSomething();
        Client client = new Client("Vit", "an", 23, "23q232");
        client.doSomething();*/
        Person person1;
        if (new Random().nextBoolean()) {
            person1 = new Person("Andrei", "Zare", 23);
        } else {
            person1  = new Client("Vit", "an", 23, "23q232");

        }
        person1.doSomething();



    }


}
