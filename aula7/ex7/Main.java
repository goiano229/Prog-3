import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    static final String ARQUIVO = "alunos.txt";
    static Scanner scanner = new Scanner(System.in);

    static void cadastrar() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();
        System.out.print("Nota: ");
        double nota;
        try {
            nota = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nota invalida.");
            return;
        }

        try (PrintStream ps = new PrintStream(new FileOutputStream(ARQUIVO, true))) {
            ps.printf("%s;%s;%.2f%n", nome, curso, nota);
            System.out.println("Aluno cadastrado.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar: " + e.getMessage());
        }
    }

    static void listar() {
        File f = new File(ARQUIVO);
        if (!f.exists() || f.length() == 0) { System.out.println("Arquivo vazio ou inexistente."); return; }

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(ARQUIVO)))) {

            String linha;
            System.out.printf("%-20s %-20s %s%n", "Nome", "Curso", "Nota");
            System.out.println("-".repeat(50));
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(";");
                if (p.length == 3)
                    System.out.printf("%-20s %-20s %s%n", p[0], p[1], p[2]);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }

    static void media() {
        File f = new File(ARQUIVO);
        if (!f.exists() || f.length() == 0) { System.out.println("Sem dados."); return; }

        double soma = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(ARQUIVO)))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(";");
                if (p.length == 3) {
                    soma += Double.parseDouble(p[2].replace(",", "."));
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
            return;
        }

        if (count == 0) System.out.println("Nenhuma nota registrada.");
        else System.out.printf("Media geral: %.2f (%d aluno(s))%n", soma / count, count);
    }

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("\n1-Cadastrar 2-Listar 3-Media 0-Sair");
            System.out.print("Opcao: ");
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1 -> cadastrar();
                case 2 -> listar();
                case 3 -> media();
            }
        } while (op != 0);
    }
}
