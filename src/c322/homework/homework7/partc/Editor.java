package c322.homework.homework7.partc;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<EventListener> listeners = new ArrayList<>();
    private String filename;

    public void addEventListener(EventListener listener) {
        listeners.add(listener);
    }

    public void removeEventListener(EventListener listener) {
        listeners.remove(listener);
    }

    public void openFile(String filename) {
        this.filename = filename;
        System.out.println("Opening file " + filename);
    }

    public void saveFile() {
        if (filename != null) {
            System.out.println("Saving file " + filename);
            notifyListeners();
        } else {
            System.out.println("Please open a file first");
        }
    }

    private void notifyListeners() {
        for (EventListener listener : listeners) {
            listener.update(filename);
        }
    }
}
