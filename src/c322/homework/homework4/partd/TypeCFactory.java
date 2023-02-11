package c322.homework.homework4.partd;

public class TypeCFactory implements MotorHomeAbstractFactory {
    @Override
    public Style createStyle() {
        return new TypeCStyle();
    }

    @Override
    public Frame createFrame() {
        return new TypeCFrame();
    }

    @Override
    public Engine createEngine() {
        return new TypeCEngine();
    }

    @Override
    public Kitchen createKitchen() {
        return new TypeCKitchen();
    }
}