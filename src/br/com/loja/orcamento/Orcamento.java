package br.com.loja.orcamento;

import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }
    public void aplicarDescontoExtra(){
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }


    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
