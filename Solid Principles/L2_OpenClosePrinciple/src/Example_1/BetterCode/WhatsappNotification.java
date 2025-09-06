package Example_1.BetterCode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Whatsapp Notification");
    }
}
