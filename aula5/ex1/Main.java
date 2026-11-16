public class Main {
    public static void main(String[] args) {
        int[][] pares = {{10, 2}, {9, 3}, {7, 0}};

        for (int[] par : pares) {
            int a = par[0], b = par[1];
            try {
                int resultado = a / b;
                System.out.printf("%d / %d = %d%n", a, b, resultado);
            } catch (ArithmeticException e) {
                System.out.printf("Erro: divisao de %d por zero nao e permitida.%n", a);
            }
        }
    }
}
