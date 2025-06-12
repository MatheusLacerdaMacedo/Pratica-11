public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Informe o caminho do arquivo JSON de entrada.");
            System.exit(1);
        }

        String caminhoArquivo = args[0];
        Compilador compilador = new Compilador();
        compilador.compilar(caminhoArquivo);
    }
}
