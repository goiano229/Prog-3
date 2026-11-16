public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("Ana", 500.00);
        ContaBancaria cp = new ContaPoupanca("Bruno", 300.00);

        System.out.println("=== Estado inicial ===");
        System.out.println(cc);
        System.out.println(cp);

        System.out.println("\n=== Operações ===");
        cc.depositar(200.00);
        cc.sacar(100.00);
        cc.sacar(600.00);

        cp.depositar(150.00);
        cp.sacar(400.00);
        cp.sacar(100.00);

        System.out.println("\n=== Saldos finais ===");
        System.out.println(cc);
        System.out.println(cp);
    }
}
