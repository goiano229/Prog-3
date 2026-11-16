public class PagamentoBoleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("[Boleto] Boleto de R$ %.2f gerado — vencimento em 3 dias úteis.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("[Boleto] Boleto cancelado — código de barras inativado.");
    }
}
