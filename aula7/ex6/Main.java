import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static File dir;

    static void verificar() {
        System.out.println(dir.exists() ? "Diretorio existe." : "Diretorio nao existe.");
    }

    static void criar() {
        if (dir.exists()) { System.out.println("Ja existe."); return; }
        System.out.println(dir.mkdirs() ? "Diretorio criado." : "Falha ao criar.");
    }

    static void listar() {
        File[] itens = dir.listFiles();
        if (itens == null || itens.length == 0) { System.out.println("Vazio."); return; }
        for (File f : itens)
            System.out.printf("  %s %s%n", f.isDirectory() ? "[DIR]" : "     ", f.getName());
    }

    static void detalhes() {
        File[] itens = dir.listFiles();
        if (itens == null) return;
        for (File f : itens)
            if (f.isFile())
                System.out.printf("  %s | %d bytes | %s%n", f.getName(), f.length(), f.getAbsolutePath());
    }

    static void criarArquivo() {
        System.out.print("Nome do arquivo: ");
        File novo = new File(dir, scanner.nextLine());
        try {
            System.out.println(novo.createNewFile() ? "Arquivo criado: " + novo.getName() : "Ja existe.");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("Caminho do diretorio: ");
        dir = new File(scanner.nextLine());

        int op;
        do {
            System.out.println("\n1-Verificar 2-Criar 3-Listar 4-Detalhes 5-Novo arquivo 0-Sair");
            System.out.print("Opcao: ");
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1 -> verificar();
                case 2 -> criar();
                case 3 -> { if (!dir.isDirectory()) { System.out.println("Nao e diretorio valido."); } else listar(); }
                case 4 -> { if (!dir.isDirectory()) { System.out.println("Nao e diretorio valido."); } else detalhes(); }
                case 5 -> { if (!dir.isDirectory()) { System.out.println("Nao e diretorio valido."); } else criarArquivo(); }
            }
        } while (op != 0);
    }
}
