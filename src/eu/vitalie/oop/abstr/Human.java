package eu.vitalie.oop.abstr;

public  abstract  class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public abstract void display();
}
