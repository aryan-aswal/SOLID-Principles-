package Example_1.BetterCode;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS Notification...");
    }
}
