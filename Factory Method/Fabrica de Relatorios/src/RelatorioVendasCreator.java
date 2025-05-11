public class RelatorioVendasCreator extends RelatorioFactory{
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioVendas();
    }
}
