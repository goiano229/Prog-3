import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Ana", 25);
        pessoas.put("Bruno", 30);
        pessoas.put("Carlos", 22);
        pessoas.put("Diana", 28);
        pessoas.put("Eduardo", 35);

        System.out.println("Mapa: " + pessoas);

        String busca = "Carlos";
        if (pessoas.containsKey(busca)) {
            System.out.println(busca + " tem " + pessoas.get(busca) + " anos.");
        } else {
            System.out.println(busca + " nao cadastrado.");
        }

        String naoExiste = "Fernanda";
        if (pessoas.containsKey(naoExiste)) {
            System.out.println(naoExiste + " tem " + pessoas.get(naoExiste) + " anos.");
        } else {
            System.out.println(naoExiste + " nao cadastrada.");
        }

        pessoas.remove("Bruno");
        System.out.println("Apos remover Bruno: " + pessoas);
    }
}
