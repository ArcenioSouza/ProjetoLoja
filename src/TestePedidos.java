import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.GeraPedidoHandler;
import br.com.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedidos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        String cliente = "Ana da Silva";

        GeraPedido gerador = new GeraPedido(cliente, orcamento.getValor(), orcamento.getQuantidadeItens());
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.execute(gerador);
        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
