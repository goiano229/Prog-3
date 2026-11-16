public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        int[] indices = {2, 0, 5, -1, 4};

        for (int idx : indices) {
            try {
                System.out.printf("Indice %d: %s%n", idx, nomes[idx]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Indice %d invalido. Use valores entre 0 e %d.%n", idx, nomes.length - 1);
            }
        }
    }
}
