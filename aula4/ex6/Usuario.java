public class Usuario {
    private String nome;
    private NivelAcesso nivel;

    public Usuario(String nome, NivelAcesso nivel) {
        this.nome  = nome;
        this.nivel = nivel;
    }

    public void verificarPermissao(String recurso) {
        boolean permitido = switch (nivel) {
            case BASICO        -> recurso.equals("CONSULTAR");
            case INTERMEDIARIO -> recurso.equals("CONSULTAR") || recurso.equals("EDITAR");
            case ADMIN         -> true;
        };

        String resultado = permitido ? "PERMITIDO" : "NEGADO";
        System.out.printf("[%s] %s tenta acessar '%s' → %s%n", nivel, nome, recurso, resultado);
    }

    @Override
    public String toString() {
        return String.format("Usuário: %s | Nível: %s", nome, nivel);
    }
}
