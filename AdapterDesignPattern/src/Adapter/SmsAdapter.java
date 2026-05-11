package Adapter;

import Interface.NotificationService;
import ThirdPartyApi.NewSendSMS;

public class SmsAdapter implements NotificationService {
    NewSendSMS newSendSMS;
    public SmsAdapter(NewSendSMS newSendSMS) {
        this.newSendSMS = newSendSMS;
    }
    @Override
    public void sendNotification(String data) {
        newSendSMS.sendSMS(data);
    }
}
