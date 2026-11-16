public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.printf("[ContaPoupanca] Saque de R$ %.2f negado para %s — saldo insuficiente (saldo: R$ %.2f)%n",
                    valor, titular, saldo);
            return;
        }
        saldo -= valor;
        System.out.printf("[ContaPoupanca] Saque de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("[ContaPoupanca] Depósito de R$ %.2f realizado. Saldo: R$ %.2f%n", valor, saldo);
    }
}
