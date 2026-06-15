# Sistema de E-commerce e Fretes
    Contexto: Você está criando o carrinho de compras de uma loja virtual.
    O sistema precisa calcular fretes e permitir avaliações. No entanto, as
    avaliações não podem ser fora do padrão (1 a 5) e os preços não
    podem ser negativos.

## Instruções:
### 1. As Exceções: * Crie uma classe NotaInvalidaException que herde de
Exception.
○ Crie um construtor que receba uma mensagem e repasse para a
superclasse.
### 2. A Classe Base: Crie uma classe abstrata Produto.
○ Atributos privados: nome (String) e preco (double).
○ No método setPreco(double preco), se o valor for menor que zero,
lance uma IllegalArgumentException com a mensagem "O preço não
pode ser negativo".
○ Método abstrato: double calcularFrete().
### 3. A Interface: Crie a interface Avaliavel.
○ Contém o método void adicionarAvaliacao(int nota) throws
NotaInvalidaException.
### 4. As Classes Filhas:
○ Crie ProdutoFisico (frete é 10% do valor) e ProdutoDigital (frete 0.0).
○ Ambas herdam de Produto e implementam Avaliavel. No método
adicionarAvaliacao, se a nota for menor que 1 ou maior que 5, lance a
NotaInvalidaException. Caso contrário, imprima a nota.
### 5. Teste o Código:
○ Na classe Main, instancie um carrinho (List<Produto>).
○ Peça ao usuário para adicionar produtos e digitar a avaliação. Envolva a
chamada de adicionarAvaliacao e a definição de preço em um bloco
try-catch, capturando as exceções e exibindo as mensagens de erro sem
parar a execução do programa.
○ Ao final, itere sobre a lista e imprima o total da compra (produtos + frete).