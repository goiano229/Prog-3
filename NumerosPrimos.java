/*
 * Lista de Atividades - Aula 1
 * Exercício 5: Números Primos
 *
 * Determina e escreve os números primos dentro de um intervalo
 * [inicio, fim] fornecido pelo usuário.
 *
 * Número primo: só é divisível por 1 e por ele mesmo (e é >= 2).
 * A verificação usa o operador % (resto da divisão), apresentado
 * nos slides. Ao encontrar um divisor, a variável 'primo' vira
 * false e a própria condição do for encerra o laço (sem break).
 */
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

        for (int numero = inicio; numero <= fim; numero++) {
            // 0, 1 e negativos não são primos.
            if (numero >= 2) {
                boolean primo = true;

                // Testa divisores de 2 até numero/2.
                // O '&& primo' encerra o laço assim que um divisor é achado.
                for (int divisor = 2; divisor <= numero / 2 && primo; divisor++) {
                    if (numero % divisor == 0) {
                        primo = false;
                    }
                }

                if (primo) {
                    System.out.print(numero + " ");
                }
            }
        }

        System.out.println(); // quebra de linha final
        sc.close();
    }
}
