import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Map<String, List<Double>> registro = new HashMap<>();

    static void cadastrar(String aluno, List<Double> notas) {
        registro.computeIfAbsent(aluno, k -> new ArrayList<>()).addAll(notas);
        System.out.println("Cadastrado: " + aluno + " com notas " + notas);
    }

    static double media(List<Double> notas) {
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    static void listarMedias() {
        System.out.println("\n=== Alunos e medias ===");
        registro.forEach((nome, notas) ->
            System.out.printf("  %s: %.2f%n", nome, media(notas)));
    }

    static void consultar(String aluno) {
        if (registro.containsKey(aluno)) {
            List<Double> notas = registro.get(aluno);
            System.out.printf("%s | Notas: %s | Media: %.2f%n", aluno, notas, media(notas));
        } else {
            System.out.println("Aluno nao encontrado: " + aluno);
        }
    }

    static void remover(String aluno) {
        if (registro.remove(aluno) != null)
            System.out.println("Removido: " + aluno);
        else
            System.out.println("Aluno nao encontrado: " + aluno);
    }

    public static void main(String[] args) {
        cadastrar("Carlos",  List.of(8.0, 7.5, 9.0));
        cadastrar("Diana",   List.of(6.0, 5.5, 7.0));
        cadastrar("Eduardo", List.of(9.5, 10.0, 8.5));
        cadastrar("Flavia",  List.of(4.0, 6.0, 5.0));

        listarMedias();

        System.out.println();
        consultar("Diana");
        consultar("Gustavo");

        remover("Flavia");
        remover("Gustavo");

        listarMedias();
    }
}
