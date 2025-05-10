public class DocumentCreatorPDF extends DocumentCreator {

    private String nomeArquivo;


    public DocumentCreatorPDF(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }

    @Override
    protected Documentos criarDocumentos() {
        return new DocumentosPDF(nomeArquivo);
    }
}
