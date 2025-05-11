public class Main {
    public static void main(String[] args) {
        UserFactory admin = new AdminCreator();
        admin.cadastrarUsuario();

        UserFactory client = new ClienteCreator();
        client.cadastrarUsuario();

        UserFactory employee = new FuncionarioCreator();
        employee.cadastrarUsuario();

    }
}