package br.com.cafeexpresso;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;

    public Pedido() {
        // todo pedico começa como PENDENTE
        this.status = StatusPedido.PENDENTE;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
