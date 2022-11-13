package Lab06.Task4;

public class Sphinx extends Cat {

    private String name;

    public Sphinx(String name) {
        super();
        this.name = name;
    }

    public void displayAge() {
        System.out.println(this.name + " age is " + super.age);
    }
}
