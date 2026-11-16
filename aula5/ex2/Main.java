public class Main {
    public static void converter(String entrada) {
        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Valor convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida: \"" + entrada + "\" nao e um inteiro valido.");
        } finally {
            System.out.println("Encerrando programa...");
        }
    }

    public static void main(String[] args) {
        converter("42");
        converter("abc");
        converter("3.14");
    }
}
