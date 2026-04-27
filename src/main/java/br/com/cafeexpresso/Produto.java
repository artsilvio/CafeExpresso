package br.com.cafeexpresso;

public class Produto {
    private String descricao;
    private double valorUnitario;

    public Produto(String descricao, double valorUnitario) {

        if (descricao == null || descricao.trim().isEmpty()) { // .trim() remove espaços do começo e do fim
            throw new IllegalArgumentException("Descrição inválida");
        }

        if (valorUnitario <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }

        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição inválida");
        }
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valorUnitario = valorUnitario;
    }

}