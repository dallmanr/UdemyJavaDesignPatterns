package creational.factory;

public class MainApp {

    static void main() {
        // Create a WhatsAppNotification
        Notification whatsAppNotification = NotificationFactory.createNotification("WhatsApp");
        whatsAppNotification.notifyUser();

        // Create an SMS Notification
        Notification smsNotification = NotificationFactory.createNotification("SMS");
        smsNotification.notifyUser();

        // Create an email notification
        Notification emailNotification = NotificationFactory.createNotification("Email");
        emailNotification.notifyUser();

        // Throw Illegal Arg Exception
        try {
            Notification wan = NotificationFactory.createNotification("wa");
            whatsAppNotification.notifyUser();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
