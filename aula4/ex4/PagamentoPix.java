public class PagamentoPix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.printf("[Pix] Transferência de R$ %.2f realizada instantaneamente.%n", valor);
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("[Pix] Pagamento Pix cancelado — devolução iniciada.");
    }
}
