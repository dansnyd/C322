package c322.labs.lab5.parta;

public class TVOnCommand {
    TV TV;

    public TVOnCommand(TV TV) {
        this.TV = TV;
    }

    public void execute() {
        TV.on();
    }

    public void undo() {
        TV.off();
    }
}
