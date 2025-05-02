package eu.vitalie.oop.abstr;

public class Client extends Human {
    private final String bank;

    public Client(String name, String  bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void display() {
        System.out.println("client from " + bank + "wit name " + getName());

    }

}
