package SistemaModelarCardapio;

public abstract class PratoPrincipal extends ItemCardapio {
  private double tempoPreparo;

  public PratoPrincipal(String nome, double precoBase, double tempoPreparo) {
    super(nome, precoBase);
    this.tempoPreparo = tempoPreparo;
  }

  /**
   * calcula o preço final do prato principal
   * @return o preço final do prato principal + o tempo de preparo
   */
  @Override
  public double calcularPrecoFinal() {
    return getPrecoBase() + (tempoPreparo);
  }

  public double getTempoPreparo() {
    return tempoPreparo;
  }

}
