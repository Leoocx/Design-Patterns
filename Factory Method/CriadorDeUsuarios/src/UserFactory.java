public abstract class UserFactory {

    protected abstract User criarUsuario();

    public void cadastrarUsuario(){
        User user = criarUsuario();
        user.criarUsuario();
    }

}
