public class DocumentosWord implements Documentos {

    private String nomeArquivo;

    public DocumentosWord(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }

    @Override
    public void gerar(){
        System.out.println("Gerando documento: "+nomeArquivo+ ".docx");
    }


}
