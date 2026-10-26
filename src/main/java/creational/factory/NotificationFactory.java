package creational.factory;

public class NotificationFactory {

    // Static because we don't want to create an instance of the NotificationFactory
    // We just want to call this method in order to create our relevant object
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("Type is null or empty");
        }

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "whatsapp" -> new WhatsAppNotification();
            default -> throw new IllegalArgumentException("Unknown notification type " + type);
        };
    }
}
