package creational.factory;

public class WhatsAppNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("WhatsApp has been sent");
    }
}
