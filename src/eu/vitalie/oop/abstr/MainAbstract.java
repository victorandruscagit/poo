package eu.vitalie.oop.abstr;

public class MainAbstract {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", "DutchBank");
        sam.display();

        Client belarus = new Client("Belarus","BelarusBank");
        belarus.display();

    }
}
