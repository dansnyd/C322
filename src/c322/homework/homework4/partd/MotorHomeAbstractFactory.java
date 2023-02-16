package c322.homework.homework4.partd;

public interface MotorHomeAbstractFactory {

    abstract Style createStyle();

    abstract Frame createFrame();

    abstract Engine createEngine();

    abstract Kitchen createKitchen();

}
