public class Main {
    public static void main(String[] args) {
        Triatleta t1 = new Triatleta("Eduardo");
        Triatleta t2 = new Triatleta("Fernanda");

        for (Triatleta t : new Triatleta[]{t1, t2}) {
            System.out.println("=== " + t.getNome() + " ===");
            t.mostrarModalidades();
            t.correr();
            t.nadar();
            t.pedalar();
            System.out.println();
        }
    }
}
