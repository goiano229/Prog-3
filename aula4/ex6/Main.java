public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Alice", NivelAcesso.BASICO);
        Usuario u2 = new Usuario("Bruno", NivelAcesso.INTERMEDIARIO);
        Usuario u3 = new Usuario("Carla", NivelAcesso.ADMIN);

        String[] recursos = {"CONSULTAR", "EDITAR", "GERENCIAR_USUARIOS"};

        for (Usuario u : new Usuario[]{u1, u2, u3}) {
            System.out.println("=== " + u + " ===");
            for (String r : recursos) {
                u.verificarPermissao(r);
            }
            System.out.println();
        }
    }
}
