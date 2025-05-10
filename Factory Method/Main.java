public class Main {
    public static void main(String[] args) {
        DocumentCreatorPDF malaDiretaPDF = new DocumentCreatorPDF("file");
        malaDiretaPDF.novoDocumento();

        DocumentCreatorWord malaDiretaWord = new DocumentCreatorWord("file");
        malaDiretaWord.novoDocumento();

    }
}
