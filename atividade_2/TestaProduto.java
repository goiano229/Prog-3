public class TestaProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Teclado";
        p1.preco = 200.0;

        Produto p2 = new Produto();
        p2.id = 2;
        p2.nome = "Monitor";
        p2.preco = 900.0;

        p1.aplicarDesconto(10);
        p2.aplicarDesconto(15);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}

class Produto {
    int id;
    String nome;
    double preco;

    void aplicarDesconto(double porcentagem) {
        preco = preco - (preco * porcentagem / 100);
    }

    void exibirDetalhes() {
        System.out.println("ID: " + id + " | Nome: " + nome + " | Preço: R$ " + String.format("%.2f", preco));
    }
}
