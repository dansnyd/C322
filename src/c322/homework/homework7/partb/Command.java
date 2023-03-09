package c322.homework.homework7.partb;

public interface Command {
    void setApp(Application app);
    void setEditor(Editor editor);
    boolean execute();
    void undo();
}
