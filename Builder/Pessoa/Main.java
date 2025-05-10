public class Main {
    public static void main(String[] args) {
        Pessoa pessoaBuilder = new PessoaBuilder()
                .definirPessoa("pessoa","pessoa@gmail.com")
                .comEndereco("13", "14", "15")
                .comTelefone("(99) 9999-9999")
                .construir();
    }
}


