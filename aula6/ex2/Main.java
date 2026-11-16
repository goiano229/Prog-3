import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> palavras = new HashSet<>();
        String[] entradas = {"Java", "Python", "Java", "C", "Python", "Kotlin", "fim"};

        for (String entrada : entradas) {
            if (entrada.equals("fim")) break;
            palavras.add(entrada);
        }

        System.out.println("Palavras unicas: " + palavras);
        System.out.println("Contem 'Java': " + palavras.contains("Java"));
        System.out.println("Total de palavras distintas: " + palavras.size());
    }
}
