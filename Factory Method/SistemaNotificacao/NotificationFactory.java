public abstract class NotificationFactory {

    protected abstract Notification generateNotification();

    public void gerarNotificacao(){
        Notification notification = generateNotification();
        notification.enviar();
    }


}
