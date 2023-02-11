package c322.homework.homework4.partd;

public abstract class MotorHomeAbstractFactory {
    Frame frame;
    Engine engine;
    Kitchen kitchen;
    Style style;

    public abstract Frame createStyle();
    public abstract Frame createFrame();
    public abstract Engine createEngine();
    public abstract Kitchen createKitchen();

}
