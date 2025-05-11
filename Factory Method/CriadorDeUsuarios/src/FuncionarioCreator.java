public class FuncionarioCreator extends UserFactory{
    @Override
    protected User criarUsuario() {
        return new Funcionario();
    }
}
