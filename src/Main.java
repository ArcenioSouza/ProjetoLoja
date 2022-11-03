import br.com.loja.imposto.CalculadoraDeImposto;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ISS()));
    }
}