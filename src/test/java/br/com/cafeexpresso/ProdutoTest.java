package br.com.cafeexpresso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    void deveCriarProdutoComDadosValidos() {
        Produto p = new Produto("CAFE", 19.0);

        assertEquals("CAFE", p.getDescricao());
        assertEquals(19.0, p.getValorUnitario());
    }

    @Test
    void naoDevePermitirValorNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("CAFE", -1.0);
        });
    }

    @Test
    void naoDevePermitirValorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto("PAO DE QUEIJO", 0.0);
        });
    }

}