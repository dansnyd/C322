package c322.homework.homework7.parta;

public class RemoteControl {
    private String state;

    public RemoteControl() {
        this.state = "Off";
    }

    public RemoteControl(String state) {
        this.state = state;
    }

    public void pressSwitch(TV tv) {
        if (this.state.equals("On")) {
            tv.setState(new RemoteControl("Off"));
        } else {
            tv.setState(new RemoteControl("On"));
        }
    }
}
