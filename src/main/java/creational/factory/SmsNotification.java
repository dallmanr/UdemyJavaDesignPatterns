package creational.factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS has been sent");
    }
}
