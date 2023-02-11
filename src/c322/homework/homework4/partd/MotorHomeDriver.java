package c322.homework.homework4.partd;

public class MotorHomeDriver {
//Ran out of time... I feel like my implenetation is very close to being complete
    public static void main(String[] args) {

        MotorHomeAbstractFactory mhFactory = null;

        String nextMotorHome = "TypeA";

        if (nextMotorHome.equals("TypeA")) {
            System.out.println("\nType A motor home selected");

            mhFactory = new TypeAFactory();
        } else if (nextMotorHome.equals("TypeB")){
            System.out.println("\nType B motor home selected");

            mhFactory = new TypeBFactory();
        } else if (nextMotorHome.equals("TypeC")){
            System.out.println("\nType C motor home selected");

            mhFactory = new TypeCFactory();
        } else {
            System.out.println("Invalid motor home type entered.");
        }

        Style mhStyle = mhFactory.createStyle();
        Frame mhFrame = mhFactory.createFrame();
        Engine mhEngine = mhFactory.createEngine();
        Kitchen mhKitchen = mhFactory.createKitchen();

        System.out.println("\nComponent list for " + nextMotorHome + " motor home");
        System.out.println(mhStyle.getStyle());
        System.out.println(mhFrame.getFrame());
        System.out.println(mhEngine.getEngine());
        System.out.println(mhKitchen.getKitchen());
    }
}
