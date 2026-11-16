public class Main {
    public static void validarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade nao pode ser negativa: " + idade);
        }
    }

    public static void processarIdade(int idade) {
        try {
            validarIdade(idade);
            System.out.println("Idade valida: " + idade);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        processarIdade(25);
        processarIdade(-3);
        processarIdade(0);
    }
}
