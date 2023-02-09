package c322.labs.lab5.parta;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public static void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
