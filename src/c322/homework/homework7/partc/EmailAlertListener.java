package c322.homework.homework7.partc;

public class EmailAlertListener implements EventListener{
    private String email;

    public EmailAlertListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String filename) {
        System.out.println("Sending email to " + email + ": File " + filename + " has been modified");
    }
}
