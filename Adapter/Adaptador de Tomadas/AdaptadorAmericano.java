public class AdaptadorAmericano implements TomadaBrasileira{

    private final TomadaAmericana tomadaAmericana;

    public AdaptadorAmericano(TomadaAmericana tomadaAmericana){
        this.tomadaAmericana=tomadaAmericana;
    }
    @Override
    public void adaptarTomada() {
        tomadaAmericana.conectarTomada();
        System.out.println("Adaptada ao padrão brasileiro (Tipo N, 127V).\n");
    }
}
