public class PagamentoPayPal {

    // Digamos que aqui tenhamos uma classe legada e que não queremos mexer
    // nessa classe, logo criaremos um adaptador para utilizar o metodo que está aqui, assim não mexemos no código original
    public void pagamentoPayPal(double valor){
        System.out.println("Pagamento realizado via PayPal no valor de R$ "+valor);
    }
}
