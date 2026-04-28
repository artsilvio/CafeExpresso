package br.com.cafeexpresso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ItemPedidoTest {
    
    @Test
    void deveCalcularSubtotalCorretamente() {
        Produto cafe = new Produto("Café", 5.0);
        ItemPedido item = new ItemPedido(cafe, 3);

        assertEquals(15.0, item.calcularSubtotal());
    }

    @Test
    void naoDevePermitirProdutoNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(null, 1);
        });
    }

    @Test
    void naoDevePermitirQuantidadeZeroOuNegativa() {
        Produto cafe = new Produto("Café", 5.0);
        
        // Verifica trava para quantidade zero
        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(cafe, 0);
        });

        // Verifica trava para quantidade negativa
        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(cafe, -5);
        });
    } 
}
