public class AdminCreator extends UserFactory{

    @Override
    protected User criarUsuario(){
        return new Admin();
    }
}
