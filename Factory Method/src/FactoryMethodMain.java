import factory.NotificationFactory;
import notification.Notification;

public class FactoryMethodMain {
    public static void main(String[] args)
    {
        NotificationFactory factory = new NotificationFactory();
        Notification sms = factory.createNotification("SMS");
        Notification email = factory.createNotification("EMAIL");

        sms.notifyUser();
        email.notifyUser();
    }
}