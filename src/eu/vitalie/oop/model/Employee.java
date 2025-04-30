package eu.vitalie.oop.model;

public class Employee extends Person {

    private int salary;

    public Employee(String name, String surname, int age, final int salary) {
        super(name, surname, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return  "Employeel" +
                "salary" + salary +
                "persont" + super.toString() ;

    }
}
