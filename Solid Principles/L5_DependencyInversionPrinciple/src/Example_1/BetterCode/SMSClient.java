package Example_1.BetterCode;

public class SMSClient implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS....");
    }
}
