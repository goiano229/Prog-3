public class FuncionarioCLT extends Funcionario {
    private static final double ADICIONAL = 0.10;

    public FuncionarioCLT(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * (1 + ADICIONAL);
    }
}
