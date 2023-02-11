package c322.homework.homework4.partd;

public class TypeAFactory implements MotorHomeAbstractFactory {

    public MotorHomeAbstractFactory
    @Override
    public void setFrame() {
        this.frame = new TypeAFrame();
    }

    @Override
    public void setEngine() {
        this.engine = new TypeAEngine();
    }

    @Override
    public void setKitchen() {
        this.kitchen = new TypeAKitchen();
    }

    @Override
    public void setStyle() {
        this.style = new TypeAStyle();
    }
}