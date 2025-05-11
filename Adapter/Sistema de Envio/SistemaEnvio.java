public class SistemaEnvio {
    public void processarEnvio(ServicoEntrega servico, String endereco, String pacote) {
        System.out.println("Solicitando envio...");
        servico.enviar(endereco, pacote);
        System.out.println("Envio processado!\n");
    }
}