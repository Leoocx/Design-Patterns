public class DocumentCreatorWord extends DocumentCreator {

    private String nomeArquivo;

    public DocumentCreatorWord(String nomeArquivo){
        this.nomeArquivo=nomeArquivo;
    }

    @Override
    protected Documentos criarDocumentos() {
        return new DocumentosWord(nomeArquivo);
    }
}
