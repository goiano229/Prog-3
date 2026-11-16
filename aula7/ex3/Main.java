import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o caminho: ");
        String caminho = scanner.nextLine();

        File f = new File(caminho);

        if (!f.exists()) {
            System.out.println("Recurso nao encontrado: " + caminho);
            return;
        }

        System.out.println("Caminho absoluto: " + f.getAbsolutePath());
        System.out.println("Tipo: " + (f.isFile() ? "arquivo" : "diretorio"));

        if (f.isFile()) {
            System.out.println("Tamanho: " + f.length() + " bytes");
        } else {
            File[] conteudo = f.listFiles();
            if (conteudo != null) {
                System.out.println("Conteudo (" + conteudo.length + " itens):");
                for (File item : conteudo)
                    System.out.println("  " + (item.isDirectory() ? "[DIR] " : "      ") + item.getName());
            }
        }
    }
}
