package notification;

public class FaxNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending fax notification.");
    }
}
