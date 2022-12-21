package factory;

import notification.EmailNotification;
import notification.FaxNotification;
import notification.Notification;
import notification.SMSNotification;

public class NotificationFactory {

    public Notification createNotification(String channel) {
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "FAX" -> new FaxNotification();
            default -> throw new IllegalArgumentException("Unknown channel");
        };
    }
}
