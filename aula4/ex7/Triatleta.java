public class Triatleta extends Atleta implements Corredor, Nadador, Ciclista {

    public Triatleta(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr()   { System.out.println(nome + " está correndo no triatlo!"); }

    @Override
    public void nadar()    { System.out.println(nome + " está nadando no triatlo!"); }

    @Override
    public void pedalar()  { System.out.println(nome + " está pedalando no triatlo!"); }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " compete em: Corrida, Natação e Ciclismo (Triatleta).");
    }
}
