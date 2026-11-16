import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> participantes = new HashSet<>();
        String[] entradas = {"Alice", "Bruno", "Alice", "Carlos", "Diana", "Bruno", "Eduardo", "fim"};

        for (String nome : entradas) {
            if (nome.equals("fim")) break;
            boolean inserido = participantes.add(nome);
            if (!inserido) System.out.println("Duplicata ignorada: " + nome);
        }

        System.out.println("Participantes: " + participantes);
        System.out.println("Total distintos: " + participantes.size());

        String consulta = "Carlos";
        System.out.println(consulta + " inscrito: " + participantes.contains(consulta));
    }
}
