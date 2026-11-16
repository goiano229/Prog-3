import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(3, 8, 15, 4, 7, 12, 9, 2, 11, 6));

        System.out.println("Numeros: " + numeros);

        int soma = numeros.stream().mapToInt(Integer::intValue).sum();
        double media = (double) soma / numeros.size();
        System.out.printf("Soma: %d | Media: %.2f%n", soma, media);

        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Apos remover pares: " + numeros);
    }
}
