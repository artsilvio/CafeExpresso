package br.com.cafeexpresso;

public class Produto {
    private String descricao;
    private double valorUnitario;

    public Produto(String descricao, double valorUnitario) {

        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida");
        }

        if (valorUnitario <= 0) {
            throw new IllegalArgumentException("Valor não pode ser = a zero ou negativo");
        }

        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}