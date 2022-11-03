package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface CalculoDoImposto {
    public BigDecimal calcular(Orcamento orcamento);
}
