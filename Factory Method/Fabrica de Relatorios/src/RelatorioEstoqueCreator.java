public class RelatorioEstoqueCreator extends RelatorioFactory{
    @Override
    protected Relatorio criarRelatorio() {
        return new RelatorioEstoque();
    }
}
