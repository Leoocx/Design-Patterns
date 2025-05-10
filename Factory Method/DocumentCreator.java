
public abstract class DocumentCreator {

   protected abstract Documentos criarDocumentos();

   void novoDocumento(){
       Documentos documento = criarDocumentos();
       documento.gerar();
   }
}
