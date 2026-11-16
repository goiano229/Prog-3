import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Integer> estoque = new HashMap<>();

    static void cadastrar(String produto, int qtd) {
        estoque.put(produto, qtd);
        System.out.printf("Cadastrado: %s (%d unidades)%n", produto, qtd);
    }

    static void consultar(String produto) {
        if (estoque.containsKey(produto))
            System.out.printf("%s: %d unidades%n", produto, estoque.get(produto));
        else
            System.out.println("Produto nao encontrado: " + produto);
    }

    static void atualizar(String produto, int qtd) {
        if (estoque.containsKey(produto)) {
            estoque.put(produto, qtd);
            System.out.printf("%s atualizado para %d unidades.%n", produto, qtd);
        } else {
            System.out.println("Produto nao encontrado: " + produto);
        }
    }

    static void remover(String produto) {
        if (estoque.remove(produto) != null)
            System.out.println("Removido: " + produto);
        else
            System.out.println("Produto nao encontrado: " + produto);
    }

    static void exibir() {
        if (estoque.isEmpty()) { System.out.println("Estoque vazio."); return; }
        estoque.forEach((p, q) -> System.out.printf("  %s: %d%n", p, q));
    }

    public static void main(String[] args) {
        cadastrar("Notebook", 10);
        cadastrar("Mouse", 50);
        cadastrar("Teclado", 30);
        cadastrar("Monitor", 15);
        cadastrar("Headset", 20);

        System.out.println("\n=== Estoque ===");
        exibir();

        consultar("Mouse");
        consultar("Impressora");

        atualizar("Teclado", 45);
        atualizar("Impressora", 5);

        remover("Headset");
        remover("Impressora");

        System.out.println("\n=== Estoque atualizado ===");
        exibir();
    }
}
