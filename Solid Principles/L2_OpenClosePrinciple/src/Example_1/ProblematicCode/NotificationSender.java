package Example_1.ProblematicCode;

import java.util.List;

public class NotificationSender {
    public void sendNotification(List<NotificationType> list) {
        for(NotificationType notification: list) {
            if(notification == NotificationType.SMS) {
                notification.sendSMSNotification();
            } else if(notification == NotificationType.EMAIL) {
                notification.sendEmailNotification();
            } else if(notification == NotificationType.WHATSAPP) {
                notification.sendWhatsappNotification();
            }
        }
    }
}

