public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

    public String getTitular() { return titular; }
    public double getSaldo()   { return saldo; }

    @Override
    public String toString() {
        return String.format("Titular: %s | Saldo: R$ %.2f", titular, saldo);
    }
}
