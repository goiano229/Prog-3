import java.util.Arrays;

public class Loja {
    static int buscar(Produto alvo, Produto[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].equals(alvo)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Dom Casmurro", 45.0, "7891000000001", "Machado de Assis");
        produtos[1] = new Livro("1984", 39.9, "7891000000002", "George Orwell");
        produtos[2] = new CD("Abbey Road", 60.0, "7891000000003", 17);
        produtos[3] = new DVD("Interestelar", 30.0, "7891000000004", 169);
        produtos[4] = new CD("Nevermind", 55.0, "7891000000005", 13);

        System.out.println("Vetor original:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        Arrays.sort(produtos);

        System.out.println("\nOrdenado por preço:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }
    }
}

class Produto implements Comparable<Produto> {
    String nome;
    double preco;
    String codigoBarras;

    Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    @Override
    public int compareTo(Produto outro) {
        return Double.compare(this.preco, outro.preco);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: R$ " + String.format("%.2f", preco) + " | Código: " + codigoBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Produto)) {
            return false;
        }
        Produto outro = (Produto) o;
        return this.codigoBarras.equals(outro.codigoBarras);
    }
}

class Livro extends Produto {
    String autor;

    Livro(String nome, double preco, String codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    CD(String nome, double preco, String codigoBarras, int numeroFaixas) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    DVD(String nome, double preco, String codigoBarras, int duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracao + " min";
    }
}
