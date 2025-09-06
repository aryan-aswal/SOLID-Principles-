package Example_1.BetterCode;

public class Notification {
    private final MessageSender messageSender;

    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String message) {
        this.messageSender.sendMessage(message);
    }
}
