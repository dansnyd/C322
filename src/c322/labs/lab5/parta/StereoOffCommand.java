package c322.labs.lab5.parta;

public class StereoOffCommand implements Command{
    Stereo Stereo;

    public StereoOffCommand(Stereo Stereo) {
        this.Stereo = Stereo;
    }

    public void execute() {
        Stereo.off();
    }

    public void undo() {
        Stereo.on();
    }
}
