package c322.homework.homework1;

public class Domestic extends Duck {

    public Domestic(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This is a Domestic duck.");
    }
}
