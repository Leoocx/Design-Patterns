public class Main {
    public static void main(String[] args) {
        ServicoEntrega fedex = new FedExAdapter(new FedExAPI());
        ServicoEntrega correios = new CorreiosAdapter(new CorreiosAPI());
        SistemaEnvio sistemaEnvio = new SistemaEnvio();

        sistemaEnvio.processarEnvio(correios,"01001-000", "Notebook");
        sistemaEnvio.processarEnvio(fedex,  "Rua das Flores, 123", "Documentos");


    }
}