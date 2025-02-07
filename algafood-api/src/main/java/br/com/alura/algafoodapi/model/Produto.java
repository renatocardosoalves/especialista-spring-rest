package br.com.alura.algafoodapi.model;

import java.math.BigDecimal;

public class Produto {

    private final String nome;
    private final BigDecimal valorTotal;

    public Produto(String nome, BigDecimal valorTotal) {
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}