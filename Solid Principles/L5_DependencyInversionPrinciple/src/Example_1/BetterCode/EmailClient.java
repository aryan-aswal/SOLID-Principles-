package Example_1.BetterCode;

public class EmailClient implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email");
    }
}
