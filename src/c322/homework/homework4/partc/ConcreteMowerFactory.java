package c322.homework.homework4.partc;

public class ConcreteMowerFactory extends MowerFactory{
    @Override
    Mower getMower(String mowerType) {
        if (mowerType == null) {
            return null;
        }
        if (mowerType.equalsIgnoreCase("RIDING")) {
            return new RidingMower();
        } else if (mowerType.equalsIgnoreCase("PUSH")) {
            return new PushMower();
        }
        return null;
    }
}
