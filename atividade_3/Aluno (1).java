public class Aluno extends Pessoa {
    String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    void exibir() {
        System.out.println("Nome: " + nome + " | Idade: " + idade + " | Matrícula: " + matricula);
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Guilherme", 22, "2023001");
        a.exibir();
    }
}

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
