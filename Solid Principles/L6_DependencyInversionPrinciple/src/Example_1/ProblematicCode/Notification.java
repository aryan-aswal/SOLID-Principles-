package Example_1.ProblematicCode;

class Notification { // High-level module
    private final EmailClient emailClient = new EmailClient(); // Direct dependency!

    public void send(String message) {
        emailClient.sendEmail(message);
    }
}