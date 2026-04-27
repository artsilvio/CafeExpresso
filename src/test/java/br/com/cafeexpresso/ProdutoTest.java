package br.com.cafeexpresso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProdutoTest {

    @Test
    void deveCriarProdutoComDadosValidos() {
        Produto p = new Produto("CAFE", 19.0);

        assertEquals("CAFE", p.getDescricao());
        assertEquals(19.0, p.getValorUnitario());
    }
}