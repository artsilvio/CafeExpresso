package br.com.cafeexpresso;

// enumeração que define os estados possíveis de um pedido.
public enum StatusPedido {
    PENDENTE, // o pedido foi iniciado, mas não pago
    PAGO, // pagamento confirmado, pronto para a cozinha
    EM_PREPARO, // sendo feito pela cozinha
    FINALIZADO // entregue ao cliente
}
