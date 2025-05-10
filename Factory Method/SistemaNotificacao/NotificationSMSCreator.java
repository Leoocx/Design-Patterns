public class NotificationSMSCreator extends NotificationFactory{
    @Override
    protected Notification generateNotification() {
        return new NotificationSMS();
    }
}
