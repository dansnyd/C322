package c322.homework.homework7.partb;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {

    private List<Command> history = new ArrayList<>();

    public void push(Command command) {
        history.add(command);
    }

    public Command pop() {
        if (history.isEmpty()) {
            return null;
        }
        Command command = history.remove(history.size() - 1);
        return command;
    }
}
