package br.com.cafeexpresso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    void deveCalcularTotalComSucesso() {
        Pedido pedido = new Pedido();
        Produto cafe = new Produto("Café", 15.0);

        pedido.adicionarItem(new ItemPedido(cafe, 2));

        assertEquals(30.0, pedido.calcularTotal());
    }

    @Test
    void pedidoDeveIniciarComoPendente() {

        Pedido pedido = new Pedido();

        assertEquals(StatusPedido.PENDENTE, pedido.getStatus());
    }
}
