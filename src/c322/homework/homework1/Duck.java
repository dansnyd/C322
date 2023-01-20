package c322.homework.homework1;

public class Duck {

    private String duckName;

    public Duck(String name) {
        this.duckName = name;
    }

    public void swim() {
        System.out.println(duckName + " is swimming!");
    }

    public void quack() {
        System.out.println("Quack");
    }

    public void display() {
        System.out.println("This is a generic duck.");
    }

    public void fly() {
        System.out.println(duckName + " is flying!");
    }
}
