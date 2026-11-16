public class Triatleta implements Corredor, Nadador, Ciclista {
    private String nome;

    public Triatleta(String nome) {
        this.nome = nome;
    }

    @Override
    public void correr()   { System.out.println(nome + " está correndo."); }

    @Override
    public void nadar()    { System.out.println(nome + " está nadando."); }

    @Override
    public void pedalar()  { System.out.println(nome + " está pedalando."); }

    public void mostrarModalidades() {
        System.out.println(nome + " compete nas modalidades: corrida, natação e ciclismo.");
    }

    public String getNome() { return nome; }
}
