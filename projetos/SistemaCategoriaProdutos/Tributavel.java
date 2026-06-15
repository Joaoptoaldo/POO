package SistemaCategoriaProdutos;

public interface Tributavel {
  /**
   * calcula o imposto sobre o valor original do produto 
   * @return retorna o valor do imposto a ser pago, que é uma porcentagem do valor original do produto
   */
  double calcularImposto();
}
