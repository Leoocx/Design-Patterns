public class DocumentosPDF implements Documentos {

    private String nomeArquivo;

    public DocumentosPDF(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }

    @Override
    public void gerar(){
        System.out.println("Gerando documento: " + nomeArquivo + ".pdf");
    }

}
