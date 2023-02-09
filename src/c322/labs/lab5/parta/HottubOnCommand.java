package c322.labs.lab5.parta;

public class HottubOnCommand implements Command {
    Hottub Hottub;

    public HottubOnCommand(Hottub Hottub) {
        this.Hottub = Hottub;
    }

    public void execute() {
        Hottub.on();
    }

    public void undo() {
        Hottub.off();
    }
}
