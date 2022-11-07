package br.com.loja.desconto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoQtdItensMaiorQueCinco(
                new DescontoOrcamentoMaiorQueQuinhentos(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
