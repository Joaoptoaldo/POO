# Categoria de Produtos

Uma loja de departamentos vende diferentes categorias de produtos, cada uma com sua própria regra de tributação e descontos.

## Requisitos

1. Defina uma interface `Tributavel` que contenha o método `calcularImposto()`.
2. Crie uma classe abstrata `Produto` com atributos `descricao` e `valorOriginal`.
3. Crie três classes concretas que estendem `Produto`:
	- `Eletronico`
	- `Vestuario`
	- `Alimento`
4. Faça com que apenas `Eletronico` e `Vestuario` implementem a interface `Tributavel`. A regra de imposto para eletrônicos é de 15% sobre o valor, e para vestuário é de 5%. Alimentos são isentos e não devem implementar a interface.
5. Em todas as três classes filhas, sobrescreva um método `aplicarDesconto(double porcentagem)` herdado da classe `Produto`. Caso o valor da porcentagem de desconto seja negativo ou superior a 50%, lance uma exceção indicando que a operação é inválida.
6. Na classe de teste, crie uma coleção de diferentes produtos misturados.
7. Percorra essa coleção utilizando um laço de controle e, utilizando polimorfismo, calcule e exiba o total de impostos que o cliente pagará apenas pelos itens que são tributáveis.

## Observações

- O comportamento tributável deve ser aplicado apenas aos tipos que implementam a interface.
- O cálculo de desconto deve validar a porcentagem antes de alterar o valor do produto.