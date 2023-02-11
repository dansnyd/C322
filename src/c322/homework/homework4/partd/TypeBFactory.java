package c322.homework.homework4.partd;

public class TypeBFactory implements MotorHomeAbstractFactory {
    @Override
    public Style getStyle() {
        return new TypeBStyle();
    }

    @Override
    public Frame getFrame() {
        return new TypeBFrame();
    }

    @Override
    public Engine getEngine() {
        return new TypeBEngine();
    }

    @Override
    public Kitchen getKitchen() {
        return new TypeBKitchen();
    }
}
