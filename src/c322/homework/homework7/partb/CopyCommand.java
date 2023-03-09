package c322.homework.homework7.partb;

public class CopyCommand implements Command{
    private Application app;
    private Editor editor;

    public CopyCommand(Application app, Editor editor) {
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
        app.setClipboard(editor.getSelection());
        return true;
    }

    @Override
    public void undo() {
        // TODO: implement
    }
}
