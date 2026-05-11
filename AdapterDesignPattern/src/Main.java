import Adapter.SmsAdapter;
import ConcreteClasses.CampaignManager;
import ConcreteClasses.SendSMS;
import Interface.NotificationService;
import ThirdPartyApi.NewSendSMS;

public class Main {
    public static void main(String[] args) {
        // we have a notification service, where we send sms to customers
        // we got another smsApi how can you integrate into your system ?
        /**
        NotificationService notificationService = new SendSMS();
        CampaignManager cm =  new CampaignManager(notificationService);
        cm.runCampaign(); **/

        // hwo can you integrate 3rd party api without breaking this application
        NewSendSMS newSendSMS = new NewSendSMS();
        NotificationService notificationService = new SmsAdapter(newSendSMS);
        CampaignManager cm =  new CampaignManager(notificationService);
        cm.runCampaign();
    }
}