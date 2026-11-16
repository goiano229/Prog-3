public class Pedido {
    private int numero;
    private double valor;
    private StatusPedido status;

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor  = valor;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
        exibirMensagem();
    }

    public void exibirMensagem() {
        String msg = switch (status) {
            case AGUARDANDO_PAGAMENTO -> "Pedido #" + numero + " aguardando pagamento.";
            case PAGO                 -> "Pedido #" + numero + " pago — será preparado em breve.";
            case ENVIADO              -> "Pedido #" + numero + " enviado — acompanhe o rastreamento.";
            case ENTREGUE             -> "Pedido #" + numero + " entregue com sucesso!";
            case CANCELADO            -> "Pedido #" + numero + " cancelado.";
        };
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return String.format("Pedido #%d | Valor: R$ %.2f | Status: %s", numero, valor, status);
    }
}
