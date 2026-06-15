package SistemaModelarCardapio;

public abstract  class Bebida extends ItemCardapio {
  private boolean isAlcoolica;

  public Bebida(String nome, double precoBase, boolean isAlcoolica) {
    super(nome, precoBase);
    this.isAlcoolica = isAlcoolica;
  }

  /**
   * calcula o preço final da bebida
   * @return o preço final da bebida * 1.10 se for alcoólica, caso contrário retorna o preço base
   */
  @Override
  public double calcularPrecoFinal() {
    if (isAlcoolica) {
      return getPrecoBase() * 1.10; 
    } else {
      return getPrecoBase();
    }
  }

  public boolean isAlcoolica() {
    return isAlcoolica;
  }

}
