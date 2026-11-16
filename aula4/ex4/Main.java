public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new PagamentoCartao(),
            new PagamentoPix(),
            new PagamentoBoleto()
        };

        double[] valores = {250.00, 89.90, 1200.00};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
            pagamentos[i].cancelarPagamento();
            System.out.println();
        }
    }
}
