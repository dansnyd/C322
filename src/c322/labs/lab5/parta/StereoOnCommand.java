package c322.labs.lab5.parta;

public class StereoOnCommand implements Command {
    Stereo Stereo;

    public StereoOnCommand(Stereo Stereo) {
        this.Stereo = Stereo;
    }

    public void execute() {
        Stereo.on();
    }

    public void undo() {
        Stereo.off();
    }
}
