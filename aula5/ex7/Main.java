public class Main {
    public static void validarIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) throw new IllegalArgumentException("Idade nao pode ser negativa.");
    }

    public static void validarNota(double nota) throws IllegalArgumentException {
        if (nota < 0 || nota > 10) throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
    }

    public static void main(String[] args) {
        Object[][] alunos = {
            {"Carlos", 20,   8.5},
            {"Diana",  -1,   7.0},
            {"Edu",    22,  11.0},
            {"Flavia", 18,   9.0},
            {"Gustavo", 25, "abc"},
        };

        int aceitos = 0, rejeitados = 0;

        for (Object[] dados : alunos) {
            String nome = (String) dados[0];
            try {
                int idade;
                double nota;

                try {
                    idade = (int) dados[1];
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("Idade invalida para " + nome);
                }

                try {
                    nota = dados[2] instanceof Number n ? n.doubleValue() : Double.parseDouble(dados[2].toString());
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Nota invalida para " + nome);
                }

                validarIdade(idade);
                validarNota(nota);

                System.out.printf("Aceito  — %s | Idade: %d | Nota: %.1f%n", nome, idade, nota);
                aceitos++;
            } catch (IllegalArgumentException e) {
                System.out.printf("Rejeitado — %s | Motivo: %s%n", nome, e.getMessage());
                rejeitados++;
            } finally {
                System.out.println("Cadastro processado.\n");
            }
        }

        System.out.printf("Resultado: %d aceito(s), %d rejeitado(s).%n", aceitos, rejeitados);
    }
}
