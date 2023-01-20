package c322.homework.homework1;

public class DecoyDucks extends Duck{

    public DecoyDucks(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("This is a Decoy duck.");
    }
}
