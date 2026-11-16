public class Main {
    public static void main(String[] args) {
        Funcionario clt          = new FuncionarioCLT("Carlos", "CLT-001", 3000.00);
        Funcionario comissionado = new FuncionarioComissionado("Diana", "COM-002", 2000.00, 800.00);

        System.out.println("=== Funcionários ===");
        System.out.println(clt);
        System.out.println(comissionado);
    }
}
