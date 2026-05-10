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

    public double calcularTotal() {

        double total = 0;

        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void pagar() {

        if (status != StatusPedido.PENDENTE) {
            throw new IllegalStateException("Pedido não pode ser pago");
        }

        status = StatusPedido.PAGO;
    }

    public void iniciarPreparo() {

        if (status != StatusPedido.PAGO) {
            throw new IllegalStateException("Pedido deve estar pago");
        }

        status = StatusPedido.EM_PREPARO;
    }

    public void finalizar() {

        if (status != StatusPedido.EM_PREPARO) {
            throw new IllegalStateException("Pedido deve estar em preparo");
        }

        status = StatusPedido.FINALIZADO;
    }
}