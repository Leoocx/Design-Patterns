
public class PessoaBuilder {
    private Pessoa pessoa;
    public PessoaBuilder(){
        this.pessoa = new Pessoa();
    }

    public PessoaBuilder definirPessoa(String nome, String email){
        pessoa.setNome(nome);
        pessoa.setEmail(email);
        return this;
    }

    public PessoaBuilder comEndereco(String rua, String cidade, String bairro){
        pessoa.setRua(rua);
        pessoa.setCidade(cidade);
        pessoa.setBairro(bairro);
        return this;
    }

    public PessoaBuilderValido comTelefone(String telefone){
        pessoa.setTelefone(telefone);
        return new PessoaBuilderValido(pessoa);
    }


}
