package c322.homework.homework7.parta;

public class PartATestDrive {
    public static void main(String[] args) {
        RemoteControl initialRemote = new RemoteControl("Off");
        TV tv = new TV(initialRemote);
        tv.pressButton();
        tv.pressButton();
    }
}

