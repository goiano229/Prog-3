public class CorredorProfissional extends Atleta implements Corredor {

    public CorredorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo em alta velocidade!");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " compete em: Corrida.");
    }
}
