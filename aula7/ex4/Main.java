import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Arquivo de origem: ");
        String origem = scanner.nextLine();
        System.out.print("Arquivo de destino: ");
        String destino = scanner.nextLine();

        try (FileInputStream fis = new FileInputStream(origem);
             FileOutputStream fos = new FileOutputStream(destino)) {

            byte[] buffer = new byte[4096];
            int lidos;
            while ((lidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, lidos);
            }
            System.out.println("Copia concluida: " + origem + " -> " + destino);

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
