public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return String.format("Nome: %s | Matrícula: %s | Salário base: R$ %.2f | Salário calculado: R$ %.2f",
                nome, matricula, salarioBase, calcularSalario());
    }
}
