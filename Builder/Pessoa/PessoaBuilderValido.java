public class PessoaBuilderValido {

    private Pessoa pessoa;

    public PessoaBuilderValido (Pessoa pessoa){
        this.pessoa=pessoa;
    }

    public Pessoa construir(){
        if (pessoa.getTelefone() == null || pessoa.getTelefone().isEmpty()) {
            throw new IllegalStateException("Telefone é obrigatório.");
        }
        return pessoa;

    }

}
