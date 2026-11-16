public class Main {
    public static void main(String[] args) {

        Atleta[] atletas = {
            new CorredorProfissional("Gabriel",  25, NivelAtleta.PROFISSIONAL),
            new NadadorProfissional ("Helena",   30, NivelAtleta.AMADOR),
            new Triatleta           ("Igor",     22, NivelAtleta.NOVATO),
            new Triatleta           ("Juliana",  28, NivelAtleta.PROFISSIONAL)
        };


        System.out.println("=== Informações dos atletas ===");
        for (Atleta a : atletas) {
            System.out.println(a);
            a.exibirModalidades();
            System.out.println();
        }


        System.out.println("=== Executando modalidades via interfaces ===");

        for (Atleta a : atletas) {
            if (a instanceof Corredor c) c.correr();
            if (a instanceof Nadador  n) n.nadar();
            if (a instanceof Ciclista ci) ci.pedalar();
        }


        System.out.println("\n=== Teste de validações ===");
        try {
            new Triatleta("", 20, NivelAtleta.NOVATO);
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado: " + e.getMessage());
        }
        try {
            new CorredorProfissional("Pedro", -5, NivelAtleta.AMADOR);
        } catch (IllegalArgumentException e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}
