package c322.homework.homework3.partb;

public abstract class Beverage {
    String description = "Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}

class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "Most Excellent House Blend";
    }
    public double cost(){
        return .89;
    }
}

class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }
    public double cost(){
        return .99;
    }
}

class Decaf extends Beverage{

    public Decaf(){
        description = "Most Excellent Decaf";
    }
    public double cost(){
        return 1.05;
    }
}
class Espresso extends Beverage{

    public Espresso(){
        description = "Most Excellent Espresso";
    }
    public double cost(){
        return 1.99;
    }
}

class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() +", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20 ;
    }
}

class SteamedMilk extends CondimentDecorator {

    public SteamedMilk (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() +", Steamed Milk";
    }

    public double cost() {
        return beverage.cost() + .10 ;
    }
}

class Soy extends CondimentDecorator {

    public Soy (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() +", Soy";
    }

    public double cost() {
        return beverage.cost() + .15 ;
    }
}

class Whip extends CondimentDecorator {

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() +", Whip";
    }

    public double cost() {
        return beverage.cost() + .10 ;
    }
}

