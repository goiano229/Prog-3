public class Aluno extends Pessoa {
    private String matricula;

    Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Guilherme", 22, "2023001");

        System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Matrícula: " + a.getMatricula());

        a.setNome("Guilherme Silva");
        a.setIdade(23);
        a.setMatricula("2023999");

        System.out.println("Após modificação:");
        System.out.println("Nome: " + a.getNome() + " | Idade: " + a.getIdade() + " | Matrícula: " + a.getMatricula());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
