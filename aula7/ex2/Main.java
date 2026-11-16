import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (PrintStream ps = new PrintStream(new FileOutputStream("anotacoes.txt"))) {

            System.out.println("Digite linhas de texto. Digite FIM para encerrar.");
            String linha;
            while (!(linha = scanner.nextLine()).equals("FIM")) {
                ps.println(linha);
            }
            System.out.println("Gravacao concluida em anotacoes.txt.");

        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
