public class Loja {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Dom Casmurro", 45.0, "Machado de Assis");
        produtos[1] = new Livro("1984", 39.9, "George Orwell");
        produtos[2] = new CD("Abbey Road", 60.0, 17);
        produtos[3] = new DVD("Interestelar", 30.0, 169);
        produtos[4] = new CD("Nevermind", 55.0, 13);

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }
    }
}

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Preço: R$ " + String.format("%.2f", preco);
    }
}

class Livro extends Produto {
    String autor;

    Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracao + " min";
    }
}
