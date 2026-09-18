import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        ContaBancaria c1 = new ContaBancaria();
        c1.numero = 101;
        c1.titular = "Ana";
        c1.saldo = 1500.0;

        ContaBancaria c2 = new ContaBancaria();
        c2.numero = 102;
        c2.titular = "Bruno";
        c2.saldo = 3200.5;

        ContaBancaria c3 = new ContaBancaria();
        c3.numero = 103;
        c3.titular = "Carla";
        c3.saldo = 750.0;

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        double total = 0;
        Iterator<ContaBancaria> it = contas.iterator();
        while (it.hasNext()) {
            ContaBancaria conta = it.next();
            System.out.println("Conta: " + conta.numero + " | Titular: " + conta.titular);
            total = total + conta.saldo;
        }

        System.out.println("\nSaldo total do banco: R$ " + String.format("%.2f", total));
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;
}
