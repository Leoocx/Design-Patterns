public class FedExAdapter implements ServicoEntrega{
    private final FedExAPI fedExAPI;
    public FedExAdapter(FedExAPI fedExAPI){
        this.fedExAPI=fedExAPI;
    }
    @Override
    public void enviar(String endereco, String pacote) {
        fedExAPI.ship(endereco,pacote);
    }
}
