public class Main {
    public static double calcularRaiz(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Nao e possivel calcular raiz quadrada de numero negativo: " + numero);
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        int[] valores = {0, 25, -9};

        for (int v : valores) {
            try {
                System.out.printf("Raiz de %d = %.2f%n", v, calcularRaiz(v));
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
