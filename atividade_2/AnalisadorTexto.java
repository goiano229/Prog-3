public class AnalisadorTexto {
    public static void main(String[] args) {
        String frase = "  Programação Orientada a Objetos com Java  ";

        String tratada = frase.trim();

        System.out.println("Frase tratada: \"" + tratada + "\"");
        System.out.println("Total de caracteres: " + tratada.length());
        System.out.println("Em maiúsculas: " + tratada.toUpperCase());
        System.out.println("Substituindo \"Java\": " + tratada.replace("Java", "Linguagem Java"));
        System.out.println("Caractere no índice 5: " + tratada.charAt(5));
    }
}
