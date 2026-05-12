package SistemaModelarCardapio;

public abstract class ItemCardapio {
  private String nome;
  private double precoBase;

  public ItemCardapio(String nome, double precoBase) {
    this.nome = nome;
    this.precoBase = precoBase;
  }

  /**
   * calcula o preço final do item do cardápio
   * @return o preço final do item do cardápio
   */
  public abstract double calcularPrecoFinal();

  public double getPrecoBase() {
    return precoBase;
  }

  public String getNome() {
    return nome;
  }
  
}
