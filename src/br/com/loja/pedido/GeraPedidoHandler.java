package br.com.loja.pedido;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoHandler {
    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
