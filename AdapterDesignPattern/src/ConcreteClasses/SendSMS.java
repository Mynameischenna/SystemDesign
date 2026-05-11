package ConcreteClasses;

import Interface.NotificationService;

public class SendSMS implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(message);
    }
}
