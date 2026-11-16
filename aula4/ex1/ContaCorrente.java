public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 1.00;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double totalDebito = valor + TAXA_SAQUE;
        if (totalDebito > saldo) {
            System.out.printf("[ContaCorrente] Saque de R$ %.2f negado para %s — saldo insuficiente (saldo: R$ %.2f, necessário: R$ %.2f)%n",
                    valor, titular, saldo, totalDebito);
            return;
        }
        saldo -= totalDebito;
        System.out.printf("[ContaCorrente] Saque de R$ %.2f + taxa R$ %.2f realizado. Saldo: R$ %.2f%n",
                valor, TAXA_SAQUE, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("[ContaCorrente] Depósito de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }
}
