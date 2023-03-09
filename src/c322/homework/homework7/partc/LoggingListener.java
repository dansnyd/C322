package c322.homework.homework7.partc;

public class LoggingListener implements EventListener{
    @Override
    public void update(String filename) {
        System.out.println("Logging changes to file " + filename);
    }
}
