public class AdaptadorEuropeu implements TomadaBrasileira{

    private final TomadaEuropeia tomadaEuropeia;

    public AdaptadorEuropeu(TomadaEuropeia tomadaEuropeia){
        this.tomadaEuropeia=tomadaEuropeia;
    }
    @Override
    public void adaptarTomada() {
        tomadaEuropeia.conectarTomada();
        System.out.println("Adaptada ao padrão brasileiro (Tipo N, 220V).\n");
    }
}
