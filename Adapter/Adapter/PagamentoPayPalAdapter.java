public class PagamentoPayPalAdapter implements Pagamento {

    private final PagamentoPayPal pagamentoPayPal;

    public PagamentoPayPalAdapter(PagamentoPayPal pagamentoPayPal){
        this.pagamentoPayPal=pagamentoPayPal;
    }
    @Override
    public void pagar(double valor) {
        pagamentoPayPal.pagamentoPayPal(valor);
    }
}
