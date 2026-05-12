# Sistema de Cardápio

Um restaurante precisa de um sistema orientado a objetos para modelar seu cardápio e fechar a conta das mesas.

## Requisitos

1. Crie uma classe abstrata `ItemCardapio` com os atributos:
	- `nome` (`String`)
	- `precoBase` (`double`)
2. Esta classe deve possuir um método abstrato `calcularPrecoFinal()`.
3. Crie duas subclasses que herdam de `ItemCardapio`:
	- `PratoPrincipal`
	- `Bebida`
4. `PratoPrincipal` deve possuir um atributo adicional `tempoPreparo`. O método `calcularPrecoFinal()` retorna o `precoBase` sem alterações.
5. `Bebida` deve possuir um atributo booleano `isAlcoolica`. O método `calcularPrecoFinal()` deve adicionar uma taxa de 10% sobre o `precoBase` se a bebida for alcoólica.
6. Crie uma classe `Pedido` que contenha uma lista ou array de objetos do tipo `ItemCardapio`.
7. Implemente um método `adicionarItem(ItemCardapio item)`.
8. Implemente um método `fecharConta()`.
9. O método `fecharConta()` deve iterar sobre a lista de itens, invocando o método `calcularPrecoFinal()` de cada um para somar o valor total da conta.
10. Mostre na classe principal (`main`) como o sistema consegue calcular corretamente os preços independentemente de ser prato ou bebida.

## Observações

- O uso de polimorfismo deve permitir que itens diferentes sejam processados pela mesma rotina.
- A lógica de preço final deve ficar concentrada nas subclasses correspondentes.