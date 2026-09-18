public class Contador {
    static int totalObjetos = 0;

    Contador() {
        totalObjetos++;
    }

    static void mostrarTotal() {
        System.out.println("Total de objetos criados: " + totalObjetos);
    }

    public static void main(String[] args) {
        new Contador();
        new Contador();
        new Contador();
        new Contador();

        Contador.mostrarTotal();
    }
}
