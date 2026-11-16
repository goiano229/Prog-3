import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Caminho do arquivo: ");
        String caminho = scanner.nextLine();

        int linhas = 0, palavras = 0, caracteres = 0;
        String maiorLinha = "";

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(caminho)))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                linhas++;
                caracteres += linha.length();
                palavras += linha.isBlank() ? 0 : linha.trim().split("\\s+").length;
                if (linha.length() > maiorLinha.length()) maiorLinha = linha;
            }

            System.out.println("Linhas: " + linhas);
            System.out.println("Palavras: " + palavras);
            System.out.println("Caracteres: " + caracteres);
            System.out.println("Maior linha: \"" + maiorLinha + "\"");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
