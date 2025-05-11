public class ClienteCreator extends UserFactory{
    @Override
    protected User criarUsuario() {
        return new Cliente();
    }
}
