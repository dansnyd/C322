package c322.homework.homework4.partc;

public class MowerDriver {

    public static void main(String[] args) {

// output header

        System.out.println("\n\nMOWER SELECTION HELPER");

// create first mower

        MowerFactory mowerFactory = new ConcreteMowerFactory();

        Mower rideIt = mowerFactory.getMower("Riding");

        rideIt.mowerType();

// create second mower

        Mower pushIt = mowerFactory.getMower("Push");

        pushIt.mowerType();

    }
}