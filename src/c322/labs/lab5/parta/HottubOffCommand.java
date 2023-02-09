package c322.labs.lab5.parta;

public class HottubOffCommand implements Command{
    Hottub Hottub;

    public HottubOffCommand(Hottub Hottub) {
        this.Hottub = Hottub;
    }

    public void execute() {
        Hottub.off();
    }

    public void undo() {
        Hottub.on();
    }
}
