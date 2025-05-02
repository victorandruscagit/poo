package eu.vitalie.oop.abstr;

public class Employee extends  Human{
    private final String  bank;

    public  Employee(String name, String bank) {
        super(name);
        this.bank = bank;
    }


    public void display() {
        System.out.println("Eployee from "+ bank + "wiht name " + getName());

    }
}
