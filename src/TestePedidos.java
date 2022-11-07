import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.Pedido;
import br.com.loja.pedido.acao.EnviarEmail;
import br.com.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestePedidos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Ana da Silva";

        GeraPedido gerador = new GeraPedido(cliente, orcamento.getValor(), orcamento.getQuantidadeItens());
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmail()));
        handler.execute(gerador);
    }
}
