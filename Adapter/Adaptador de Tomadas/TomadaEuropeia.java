public class TomadaEuropeia implements Tomada{
    @Override
    public int getVoltagem() {
        return 220;
    }

    @Override
    public String getTipoPino() {
        return "Tipo C (2 pinos redondos)";
    }

    @Override
    public void conectarTomada(){
        System.out.println("Tomada europeia conectada.");
    }
}
