public class Main {
    public static void main(String[] args) {
        TomadaBrasileira tomada1 = new AdaptadorAmericano(new TomadaAmericana());
        TomadaBrasileira tomada2 = new AdaptadorEuropeu(new TomadaEuropeia());

        TomadaCliente cliente = new TomadaCliente();
        cliente.usarTomada(tomada1);
        cliente.usarTomada(tomada2);

    }
}