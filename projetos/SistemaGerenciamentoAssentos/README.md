# Sistema de Gerenciamento de Assentos

Desenvolva um sistema básico de gerenciamento de assentos para voos comerciais.

## Requisitos

1. Crie uma classe `Voo` que possua os seguintes atributos privados:
	- `numeroDoVoo` (`String`)
	- `destino` (`String`)
	- um array de booleanos `assentos` representando a disponibilidade de 100 lugares, onde `false` indica livre e `true` indica ocupado
2. Implemente um método construtor que inicialize o voo com seu número, destino e todos os assentos como livres.
3. Utilize o encapsulamento criando métodos getters apenas para o número do voo e o destino.
4. Crie um método `reservarAssento(int numeroAssento)`. Este método deve alterar o status do assento para ocupado.
5. Tratamento de exceções: ao tentar reservar um assento, o método deve lançar uma exceção personalizada chamada `AssentoOcupadoException` caso o assento já esteja reservado. Se o número do assento passado for menor que 1 ou maior que 100, deve lançar uma `IllegalArgumentException`.
6. Crie uma classe principal para testar a instanciação do objeto, realizar reservas válidas e capturar as exceções com blocos `try-catch`.

## Observações

- A classe deve seguir os princípios de encapsulamento.
- A validação dos assentos deve impedir reservas fora do intervalo permitido.