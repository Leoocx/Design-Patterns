public class TomadaAmericana implements Tomada {
    @Override
    public int getVoltagem() {
        return 110;
    }

    @Override
    public String getTipoPino() {
        return "Tipo A (2 pinos chatos)";
    }

    @Override
    public void conectarTomada(){
        System.out.println("Tomada americana conectada.");
    }


}
