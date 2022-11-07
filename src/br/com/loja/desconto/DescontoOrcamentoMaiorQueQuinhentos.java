package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoMaiorQueQuinhentos extends Desconto {

    public DescontoOrcamentoMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.10"));
        }
        return proximo.calcular(orcamento);
    }
}
