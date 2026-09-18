import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {
    static boolean validarNome(String nome) {
        if (nome == null) {
            return false;
        }
        return nome.trim().length() >= 3;
    }

    static boolean buscar(ArrayList<String> lista, String busca) {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<String>();

        String[] candidatos = {"Ana", "Bruno", "Carla", "Daniel"};
        for (int i = 0; i < candidatos.length; i++) {
            if (validarNome(candidatos[i])) {
                usuarios.add(candidatos[i]);
            }
        }

        System.out.println("Usuários cadastrados: " + usuarios);

        String alvo = "carla";
        if (buscar(usuarios, alvo)) {
            System.out.println("Usuário \"" + alvo + "\" encontrado na lista.");
        } else {
            System.out.println("Usuário \"" + alvo + "\" não encontrado.");
        }
    }
}
