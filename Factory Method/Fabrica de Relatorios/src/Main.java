public class Main {
    public static void main(String[] args) {
        RelatorioFactory estoque = new RelatorioEstoqueCreator();
        estoque.gerarRelatorio();

        RelatorioFactory financeiro = new RelatorioFinanceiroCreator();
        financeiro.gerarRelatorio();

        RelatorioFactory vendas = new RelatorioVendasCreator();
        vendas.gerarRelatorio();
    }
}