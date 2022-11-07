package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoQtdItensMaiorQueCinco extends Desconto {

    public DescontoQtdItensMaiorQueCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }
        return proximo.calcular(orcamento);
    }
}
