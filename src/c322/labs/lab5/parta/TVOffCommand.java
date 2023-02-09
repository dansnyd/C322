package c322.labs.lab5.parta;

public class TVOffCommand implements Command {
    TV TV;

    public TVOffCommand(TV TV) {
        this.TV = TV;
    }

    public void execute() {
        TV.off();
    }

    public void undo() {
        TV.on();
    }
}
