import br.com.loja.desconto.CalculadoraDeDesconto;
import br.com.loja.imposto.CalculadoraDeImposto;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println("Imposto: " + calculadora.calcular(orcamento1, new ISS()));
        System.out.println("-----------------------------------------------------");
        System.out.println("Desconto 1: " + calculadoraDeDesconto.calcular(orcamento1));
        System.out.println("Desconto 2: " + calculadoraDeDesconto.calcular(orcamento2));
        System.out.println("-----------------------------------------------------");
        orcamento2.aplicarDescontoExtra();
        System.out.println("Desconto 3: " + orcamento2.getValor());
        System.out.println("-----------------------------------------------------");
        orcamento2.aprovar();
        orcamento2.aplicarDescontoExtra();
        System.out.println("Desconto 4: " + orcamento2.getValor());
        System.out.println("-----------------------------------------------------");
        orcamento2.finalizar();
        orcamento2.aplicarDescontoExtra();
        System.out.println("Desconto 5: " + orcamento2.getValor());
    }
}