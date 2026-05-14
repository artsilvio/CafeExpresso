package br.com.cafeexpresso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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

    @Test
    void deveAlterarStatusParaPago() {

        Pedido pedido = new Pedido();

        pedido.pagar();

        assertEquals(StatusPedido.PAGO, pedido.getStatus());
    }

    @Test
    void deveAlterarStatusParaEmPreparo() {

        Pedido pedido = new Pedido();

        pedido.pagar();
        pedido.iniciarPreparo();

        assertEquals(StatusPedido.EM_PREPARO, pedido.getStatus());
    }

    @Test
    void deveFinalizarPedido() {

        Pedido pedido = new Pedido();

        pedido.pagar();
        pedido.iniciarPreparo();
        pedido.finalizar();

        assertEquals(StatusPedido.FINALIZADO, pedido.getStatus());
    }

    @Test
    void naoDeveIniciarPreparoSemPagamento() {

        Pedido pedido = new Pedido();

        assertThrows(IllegalStateException.class, () -> {
            pedido.iniciarPreparo();
        });
    }

    @Test
    void naoDeveFinalizarSemEstarEmPreparo() {

        Pedido pedido = new Pedido();

        assertThrows(IllegalStateException.class, () -> {
            pedido.finalizar();
        });
    }

    @Test
    void naoDeveAdicionarItemNulo() {

        Pedido pedido = new Pedido();

        assertThrows(IllegalArgumentException.class, () -> {
            pedido.adicionarItem(null);
        });
    }

    @Test
    void deveSomarCorretamenteVariosItensDiferentes() {
        Pedido pedido = new Pedido();
        Produto cafe = new Produto("Café", 15.0);
        Produto coxinha = new Produto ("Coxinha", 6.0);

        pedido.adicionarItem(new ItemPedido(cafe, 2));
        pedido.adicionarItem(new ItemPedido(coxinha, 2));

        assertEquals(42.0, pedido.calcularTotal());
    }


}
