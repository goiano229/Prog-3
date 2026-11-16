#include <iostream>
#include <string>
using namespace std;

class ContaBancaria {
private:
    string numeroConta;
    double saldo;

public:
    ContaBancaria(string numero) : numeroConta(numero), saldo(0.0) {}

    // Apenas leitura do saldo; nao ha setter direto
    double getSaldo() const { return saldo; }

    void depositar(double valor) {
        if (valor <= 0) {
            cout << "Deposito invalido.\n";
            return;
        }
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= 0) {
            cout << "Saque invalido.\n";
            return;
        }
        if (valor > saldo) {
            cout << "Saldo insuficiente.\n";
            return;
        }
        saldo -= valor;
    }
};

int main() {
    ContaBancaria c("12345-6");
    c.depositar(100.0);
    c.sacar(30.0);
    c.sacar(1000.0); // recusado: saldo insuficiente
    cout << "Saldo: R$ " << c.getSaldo() << endl;
    return 0;
}
