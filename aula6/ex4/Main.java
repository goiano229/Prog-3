import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> catalogo = new ArrayList<>(List.of(
        "O Senhor dos Aneis", "1984", "Dom Casmurro", "Harry Potter"
    ));

    static void listar() {
        if (catalogo.isEmpty()) { System.out.println("Catalogo vazio."); return; }
        for (int i = 0; i < catalogo.size(); i++)
            System.out.printf("[%d] %s%n", i, catalogo.get(i));
    }

    static void adicionar(String titulo) {
        catalogo.add(titulo);
        System.out.println("Livro adicionado: " + titulo);
    }

    static void pesquisar(String titulo) {
        int idx = catalogo.indexOf(titulo);
        if (idx >= 0) System.out.printf("Encontrado no indice %d: %s%n", idx, titulo);
        else System.out.println("Titulo nao encontrado: " + titulo);
    }

    static void remover(int idx) {
        if (idx < 0 || idx >= catalogo.size()) {
            System.out.println("Indice invalido: " + idx);
            return;
        }
        System.out.println("Removido: " + catalogo.remove(idx));
    }

    public static void main(String[] args) {
        System.out.println("=== Catalogo inicial ===");
        listar();

        adicionar("Duna");
        pesquisar("1984");
        pesquisar("Biblia");
        remover(1);
        remover(10);

        System.out.println("\n=== Catalogo final ===");
        listar();
    }
}
