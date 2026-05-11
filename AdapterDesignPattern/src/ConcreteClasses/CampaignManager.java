package ConcreteClasses;

import Interface.NotificationService;

public class CampaignManager {
    NotificationService notificationService;
    public CampaignManager(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void runCampaign(){
        notificationService.sendNotification("Campaign Activated");
    }
}
