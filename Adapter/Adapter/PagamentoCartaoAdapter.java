public class PagamentoCartaoAdapter implements Pagamento{

    private final PagamentoCartao pagamentoCartao;

    public PagamentoCartaoAdapter(PagamentoCartao pagamentoCartao){
        this.pagamentoCartao=pagamentoCartao;
    }

    @Override
    public void pagar(double valor) {
        pagamentoCartao.pagamentoNoCartao(valor);
    }
}
