public class Test {

    public static void main(String[] args){
        SQLQueryBuilder builder = new SQLQueryBuilder();
        String query = builder
                .select("id", "nome")
                .from("usuarios")
                .where("status = 'ativo'")
                .orderBy("nome")
                .build();

        System.out.println(query);

    }
}
