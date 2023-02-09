package c322.labs.lab5.parta;

public class CeilingFanOnCommand implements Command{
    CeilingFan CeilingFan;

    public CeilingFanOnCommand(CeilingFan CeilingFan) {
        this.CeilingFan = CeilingFan;
    }

    public void execute() {
        CeilingFan.on();
    }

    public void undo() {
        CeilingFan.off();
    }
}
