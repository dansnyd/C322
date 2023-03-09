package c322.homework.homework7.partb;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void onClick() {
        command.execute();
    }
}
