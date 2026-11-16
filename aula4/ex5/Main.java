public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(1001, 350.00);
        Pedido p2 = new Pedido(1002, 89.90);
        Pedido p3 = new Pedido(1003, 1500.00);

        System.out.println("=== Estado inicial ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n=== Atualizações ===");
        p1.alterarStatus(StatusPedido.PAGO);
        p1.alterarStatus(StatusPedido.ENVIADO);
        p1.alterarStatus(StatusPedido.ENTREGUE);

        p2.alterarStatus(StatusPedido.PAGO);

        p3.alterarStatus(StatusPedido.CANCELADO);

        System.out.println("\n=== Estado final ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
