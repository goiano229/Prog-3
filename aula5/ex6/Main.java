public class Main {
    public static void registrarProduto(String descricao, String precoStr, String qtdStr) {
        try {
            double preco = Double.parseDouble(precoStr);
            int quantidade = Integer.parseInt(qtdStr);

            if (preco < 0) throw new IllegalArgumentException("Preco nao pode ser negativo.");
            if (quantidade < 0) throw new IllegalArgumentException("Quantidade nao pode ser negativa.");

            double total = preco * quantidade;
            System.out.printf("Produto: %s | Preco: R$ %.2f | Qtd: %d | Total: R$ %.2f%n",
                    descricao, preco, quantidade, total);
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de validacao: " + e.getMessage());
        } finally {
            System.out.println("Processamento encerrado.\n");
        }
    }

    public static void main(String[] args) {
        registrarProduto("Notebook", "2500.00", "10");
        registrarProduto("Mouse", "abc", "5");
        registrarProduto("Teclado", "150.00", "-3");
    }
}
