public class NadadorProfissional extends Atleta implements Nadador {

    public NadadorProfissional(String nome, int idade, NivelAtleta nivel) {
        super(nome, idade, nivel);
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando com técnica apurada!");
    }

    @Override
    public void exibirModalidades() {
        System.out.println(nome + " compete em: Natação.");
    }
}
