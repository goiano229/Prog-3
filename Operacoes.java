/*
 * Lista de Atividades - Aula 1
 * Exercício 4: Operações básicas
 *
 * Lê dois números e uma operação escolhida pelo usuário e realiza
 * uma das 4 operações: (+), (-), (/) ou (*), usando switch.
 *
 * Observação: Scanner (java.util.Scanner) não foi apresentado nos
 * slides da Aula 1, mas é o mecanismo padrão em Java para ler
 * entrada do teclado, exigida pelo enunciado ("escolha do usuário").
 */
import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("  1 - Soma (+)");
        System.out.println("  2 - Subtração (-)");
        System.out.println("  3 - Divisão (/)");
        System.out.println("  4 - Multiplicação (*)");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                if (n2 == 0) {
                    System.out.println("Erro: divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
                break;
            case 4:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
