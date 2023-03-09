package c322.homework.homework7.partb;

public class Application {
    private Editor[] editors;
    private Editor activeEditor;
    private String clipboard;
    private CommandHistory history = new CommandHistory();


    public Application(int numEditors) {
        editors = new Editor[numEditors];
        for (int i = 0; i < numEditors; i++) {
            editors[i] = new Editor();
        }
        activeEditor = editors[0];
        clipboard = "";
    }

    public void createUI() {
        //implementation
    }

    public void execute(Command command) {
        command.setApp(this);
        command.setEditor(activeEditor);
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public Editor getActiveEditor() {
        return activeEditor;
    }

    public void setActiveEditor(Editor editor) {
        activeEditor = editor;
    }

    public String getClipboard() {
        return clipboard;
    }

    public void setClipboard(String clipboard) {
        this.clipboard = clipboard;
    }

    public void addEditor(Editor editor) {
    }
}
