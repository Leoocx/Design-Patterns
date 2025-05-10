public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartaoAdapter(new PagamentoCartao());
        pagamento.pagar(100);

        Pagamento pagamentoPayPal = new PagamentoPayPalAdapter(new PagamentoPayPal());
        pagamentoPayPal.pagar(1000);

    }
}