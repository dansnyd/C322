package c322.homework.homework4.partd;

public class TypeCFactory implements MotorHomeAbstractFactory {
    @Override
    public Style getStyle() {
        return new TypeCStyle();
    }

    @Override
    public Frame getFrame() {
        return new TypeCFrame();
    }

    @Override
    public Engine getEngine() {
        return new TypeCEngine();
    }

    @Override
    public Kitchen getKitchen() {
        return new TypeCKitchen();
    }
}