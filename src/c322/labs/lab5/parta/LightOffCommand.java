package c322.labs.lab5.parta;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public static void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
