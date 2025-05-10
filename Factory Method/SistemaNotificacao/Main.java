public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new NotificationEmailCreator();
        emailFactory.gerarNotificacao();

        NotificationFactory smsFactory = new NotificationSMSCreator();
        smsFactory.gerarNotificacao();

    }
}