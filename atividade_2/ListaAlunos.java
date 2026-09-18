import java.util.ArrayList;
import java.util.Iterator;

public class ListaAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>();
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carla");
        alunos.add("Daniel");
        alunos.add("Eduarda");

        System.out.println("Lista inicial:");
        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        alunos.remove("Carla");

        System.out.println("\nLista após remover \"Carla\":");
        Iterator<String> it2 = alunos.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
