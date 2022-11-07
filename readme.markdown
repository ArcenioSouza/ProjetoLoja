# Projeto Loja - Aprendendo Design Patterns comportamentais

Esse projeto é a simulação de uma loja que gera orçamento, pedidos e calcula descontos.

Seu objetivo foi criar um exemplo prático de como desenvolver projetos usando padrões
muito utilizados no mercado.

## Aprendizados
- Como diminuir a complexidade do nosso código, 
trocando múltiplas condicionais por classes usando **Strategy**;
- Como criar uma cadeia de possíveis algoritmos com o **Chain of Responsibility**;
- Criar um template de algoritmo que estava sendo replicado em mais de uma 
classe e utilizar herança para reaproveitar esse código usando **Template Method**;
- Que, se o resultado de uma chamada de método depende do estado, podemos delegar 
esta ação para uma classe específica do estado atual usando o **State**;
- Que um caso de uso deve ser extraído para uma classe específica, 
ao invés de estar no arquivo da CLI, controller ou algo do tipo e essa técnica de extração
chamamos **Command**;
- Como ligar um evento ocorrido com suas ações, através do padrão **Observer**.

## Link para saber mais
[Documentação sobre o aprendizado com exemplos](https://bitter-zoo-efd.notion.site/Design-Patterns-Padr-es-de-Projeto-77c8aff7969b4c75926b07172bb8bbef)