
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class SQLQueryBuilder {
    private String table;
    private List<String> columns = new ArrayList<>();
    private List<String> whereClauses = new ArrayList<>();
    private String orderBy;
    public SQLQueryBuilder select(String... cols){
        columns.addAll(Arrays.asList(cols)); // Agora sim!
        return this;
    }
    public SQLQueryBuilder from(String table){
        this.table = table;
        return this;
    }

    public SQLQueryBuilder where(String condition){
        whereClauses.add(condition);
        return this;
    }

    public SQLQueryBuilder orderBy(String orderBy){
        this.orderBy=orderBy;
        return this;
    }

    public String build(){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(columns.isEmpty() ? "*" : String.join(", ", columns));
        sb.append(" FROM ").append(table);

        if (!whereClauses.isEmpty()){
            sb.append(" WHERE ").append(String.join(" AND ", whereClauses));
        }

        if (orderBy != null){
            sb.append(" ORDER BY ").append(orderBy);
        }
        sb.append(";");
        return sb.toString();
    }

}
