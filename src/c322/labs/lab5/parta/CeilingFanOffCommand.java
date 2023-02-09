package c322.labs.lab5.parta;

public class CeilingFanOffCommand implements Command{
    CeilingFan CeilingFan;

    public CeilingFanOffCommand(CeilingFan CeilingFan) {
        this.CeilingFan = CeilingFan;
    }

    public void execute() {
        CeilingFan.off();
    }

    public void undo() {
        CeilingFan.on();
    }
}
