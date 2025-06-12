import java.io.StringReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql = "select nome, idade from usuarios where idade >= 18 and ativo = 'true';";

        SqlLexer lexer = new SqlLexer(new StringReader(sql));
        SqlParser parser = new SqlParser(lexer);
        parser.parse();

        System.out.println("Análise sintática concluída com sucesso!");
    }
}
