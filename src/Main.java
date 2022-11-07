import br.com.loja.desconto.CalculadoraDeDesconto;
import br.com.loja.imposto.CalculadoraDeImposto;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 6, situacao);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1, situacao);

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println("Imposto: " + calculadora.calcular(orcamento1, new ISS()));
        System.out.println("-----------------------------------------------------");
        System.out.println("Desconto 1: " + calculadoraDeDesconto.calcular(orcamento1));
        System.out.println("Desconto 2: " + calculadoraDeDesconto.calcular(orcamento2));
    }
}