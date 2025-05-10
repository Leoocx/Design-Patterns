public class NotificationEmailCreator extends NotificationFactory{
    @Override
    protected Notification generateNotification() {
        return new NotificationEmail();
    }
}
