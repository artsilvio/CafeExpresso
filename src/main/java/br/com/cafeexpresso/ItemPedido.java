package br.com.cafeexpresso;

/**
 * Representa um item específico dentro de um pedido, 
 * vinculando um produto à sua quantidade desejada.
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Calcula o valor total deste item (Preço Unitário x Quantidade).
     */
    public double calcularSubtotal() {
        return produto.getValorUnitario() * quantidade;
    }

    // Getters 
    public Produto getProduto() { 
        return produto; 
    }
    public int getQuantidade() { 
        return quantidade; 
    }
}