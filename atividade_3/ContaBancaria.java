public class ContaBancaria {
    int numero;

    ContaBancaria(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        ContaBancaria outra = (ContaBancaria) o;
        return this.numero == outra.numero;
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(123);
        ContaBancaria c2 = new ContaBancaria(123);
        ContaBancaria c3 = new ContaBancaria(456);

        System.out.println("Impressão direta (toString): " + c1);
        System.out.println("c1.equals(c2) [números iguais]: " + c1.equals(c2));
        System.out.println("c1.equals(c3) [números diferentes]: " + c1.equals(c3));
    }
}
