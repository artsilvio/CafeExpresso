package br.com.cafeexpresso;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;

    public Pedido() {
        this.status = StatusPedido.PENDENTE;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {

        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo");
        }

        itens.add(item);
    }

    // Calcula o valor total do pedido.
    // omando os subtotais de todos os itens.
    // Retorna o valor total do pedido.
    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    // Altera o status do pedido para PAGO.
    public void pagar() {

        if (status != StatusPedido.PENDENTE) {
            throw new IllegalStateException("Somente pedidos pendentes podem ser pagos");
        }

        status = StatusPedido.PAGO;
    }

    // Altera o status do pedido para EM PREPARO.
    public void iniciarPreparo() {

        if (status != StatusPedido.PAGO) {
            throw new IllegalStateException("Somente pedidos pagos podem ir para preparo");
        }

        status = StatusPedido.EM_PREPARO;
    }

    // Finaliza o pedido que está em preparo.
    public void finalizar() {

        if (status != StatusPedido.EM_PREPARO) {
            throw new IllegalStateException("Somente pedidos em preparo podem ser finalizados");
        }

        status = StatusPedido.FINALIZADO;
    }
}