public abstract class RelatorioFactory {
    protected abstract Relatorio criarRelatorio();
    public void gerarRelatorio() {
        System.out.println("Usando factory: " + this.getClass().getSimpleName());
        Relatorio relatorio = criarRelatorio();
        relatorio.gerarRelatorio();
    }


}
