package Example_1.ProblematicCode;

public enum NotificationType {
    SMS,
    WHATSAPP,
    EMAIL;

    public void sendSMSNotification() {
        System.out.println("Sending SMS Notification...");
    }
    public void sendWhatsappNotification() {
        System.out.println("Sending Whatsapp Notification...");
    }
    public void sendEmailNotification() {
        System.out.println("Sending Email Notification...");
    }
}
