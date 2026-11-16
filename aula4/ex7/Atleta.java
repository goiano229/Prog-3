public abstract class Atleta {
    protected String nome;
    protected int idade;
    protected NivelAtleta nivel;

    public Atleta(String nome, int idade, NivelAtleta nivel) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome do atleta não pode ser vazio.");
        if (idade < 0)
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        this.nome  = nome;
        this.idade = idade;
        this.nivel = nivel;
    }

    public abstract void exibirModalidades();

    public String getNome()         { return nome; }
    public int    getIdade()        { return idade; }
    public NivelAtleta getNivel()   { return nivel; }

    @Override
    public String toString() {
        return String.format("Atleta: %s | Idade: %d | Nível: %s", nome, idade, nivel);
    }
}
