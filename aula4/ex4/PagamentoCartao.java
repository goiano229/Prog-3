public class PagamentoCartao implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("[Cartão] Pagamento de R$ %.2f processado — aguardando autorização da operadora.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("[Cartão] Pagamento cancelado — estorno solicitado à operadora.");
    }
}
