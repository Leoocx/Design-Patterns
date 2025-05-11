public class RelatorioFinanceiroCreator extends RelatorioFactory{
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioFinanceiro();
    }
}
