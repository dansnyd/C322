package c322.homework.homework7.parta;

public class TV {
    private RemoteControl state;

    public TV(RemoteControl state) {
        this.state = state;
    }

    public RemoteControl getState() {
        return this.state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton() {
        this.state.pressSwitch(this);
    }
}
