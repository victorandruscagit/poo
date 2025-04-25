package eu.vitalie.oop.model;

public class Client extends Person {

    private String uuid;

    public Client(String name, String surname, int age, String uuid) {
        super(name, surname, age);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
