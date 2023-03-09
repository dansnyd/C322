package c322.homework.homework7.partc;

public class Observer {
    public static void main(String[] args) {

        Editor editor = new Editor();


        EventListener emailListener = new EmailAlertListener("example@example.com");


        EventListener loggingListener = new LoggingListener();


        editor.addEventListener(emailListener);
        editor.addEventListener(loggingListener);


        editor.openFile("example.txt");


        editor.saveFile();
    }
}
