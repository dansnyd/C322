package c322.homework.homework7.partb;

public class Shortcut {
    private Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void onPress() {
        command.execute();
    }
}
