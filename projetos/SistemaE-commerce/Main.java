import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Produto> produtos = new ArrayList<>();

    ProdutoFisico produto1 = new ProdutoFisico("Camiseta", 50.0);
    ProdutoDigital produto2 = new ProdutoDigital("E-book", 20.0);

    produtos.add(produto1);
    produtos.add(produto2);

    System.out.println("Produtos disponíveis:");
    for (Produto produto : produtos) {
      System.out.println(produto.getNome() + " - R$" + produto.getPreco());
    }

    // envolva a chamada de adicionarAvaliacao e a definição de preço em um bloco try-catch, capturando as exceções e exibindo as mensagens de erro sem parar a execução do programa. 
    try {
      produto1.adicionarAvaliacao(4);
      produto2.adicionarAvaliacao(6); 

    } catch (NotaInvalidaException e) {
      System.out.println("Erro ao adicionar avaliação: " + e.getMessage());
    }

    // itere sobre a lista e imprima o total da compra (produtos + frete)
    double totalCompra = 0.0;
    for (Produto produto : produtos) {
      totalCompra += produto.getPreco() + produto.calcularFrete();
    }
    System.out.println("Total da compra (produtos + frete): R$" + totalCompra);
  }
}
