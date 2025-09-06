package Example_1.BetterCode;

import java.util.List;

public class notificationSender {
    public void sendNotification(List<Notification> list) {
        for(Notification notification: list) {
            notification.send();
        }
    }
}

