package c322.homework.homework7.partb;

public class BackupCommand implements Command{ private Application app;
    private Editor editor;
    private String backup;

    public BackupCommand(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;
    }

    @Override
    public void setApp(Application app) {
        this.app = app;
    }

    @Override
    public void setEditor(Editor editor) {
        this.editor = editor;
    }

    @Override
    public boolean execute() {
        backup = editor.getText();
        return true;
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }
}