import java.io.*;

public class Compilador {
    public void compilar(String caminhoDoArquivoDeEntrada) throws Exception {
    StringBuilder conteudo = new StringBuilder();

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivoDeEntrada))) {
        String linha;
        while ((linha = br.readLine()) != null) {
            conteudo.append(linha).append("\n");
        }
    } catch (IOException e) {
        System.err.println("Erro ao ler arquivo de entrada: " + e.getMessage());
        return;
    }

    System.out.println("> Conteúdo do arquivo:");
    System.out.println(conteudo.toString());

    processar(conteudo.toString());
}


    public void processar(String texto) {
    StringReader stringReader = new StringReader(texto);

    JsonLexer lexer = new JsonLexer(stringReader);
    MeuParser parser = new MeuParser(lexer);

    try {
        parser.parse();
        System.out.println("Análise concluída sem erros.");
    } catch (Exception e) {
        System.err.println("Erro na expressão: " + e.getMessage());
    }
}


}
