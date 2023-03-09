package c322.homework.homework7.partb;

public class UndoCommand implements Command{
    private Application app;

    public UndoCommand(Application app) {
        this.app = app;
    }

    @Override
    public void setApp(Application app) {
        this.app = app;
    }

    @Override
    public void setEditor(Editor editor) {
        // do nothing
    }

    @Override
    public boolean execute() {
        app.undo();
        return false;
    }

    @Override
    public void undo() {
        // do nothing
    }
}
