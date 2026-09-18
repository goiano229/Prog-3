public class Livro {
    String titulo;
    String autor;

    Livro() {
        this.titulo = "Título desconhecido";
        this.autor = "Autor desconhecido";
    }

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void exibir() {
        System.out.println("Título: " + titulo + " | Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro l1 = new Livro();
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis");

        l1.exibir();
        l2.exibir();
    }
}
