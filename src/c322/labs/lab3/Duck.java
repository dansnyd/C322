package c322.labs.lab3;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks swim");

    }

    public interface FlyBehavior {
        void fly();
    }

    public class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I'm flying");
        }
    }

    public class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can't fly");
        }
    }
    public interface QuackBehavior {
        void quack();
    }
    public class Quack implements QuackBehavior {
        public void quack() {
            System.out.println("Quack");
        }
    }
    public class MuteQuack implements QuackBehavior {
        public void quack() {
            System.out.println("*Crickets*");
        }
    }
    public class Squeak implements QuackBehavior {
        public void quack() {
            System.out.println("Squeak");
        }
    }
    public class MallardDuck extends Duck {

        public MallardDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }

        @Override
        public void display() {
            System.out.println("This is a Mallard duck.");
        }
    }

    public class RedheadDuck extends Duck {

        public RedheadDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }

        @Override
        public void display() {
            System.out.println("This is a Redhead duck.");
        }
    }

    public class RubberDuck extends Duck {

        public RubberDuck() {
            quackBehavior = new Squeak();
            flyBehavior = new FlyNoWay();
        }

        @Override
        public void display() {
            System.out.println("This is a Rubber duck.");
        }
    }

    public class DecoyDuck extends Duck {

        public DecoyDuck() {
            quackBehavior = new MuteQuack();
            flyBehavior = new FlyNoWay();
        }

        @Override
        public void display() {
            System.out.println("This is a Decoy duck.");
        }
    }
}