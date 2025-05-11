public class CorreiosAdapter implements ServicoEntrega{
    private final CorreiosAPI correiosAPI;
    public CorreiosAdapter(CorreiosAPI correiosAPI){
        this.correiosAPI=correiosAPI;
    }

    @Override
    public void enviar(String endereco, String pacote) {
        correiosAPI.enviarPacote(endereco,pacote);
    }
}
