package SistemaCategoriaProdutos;

public abstract class Produto {
  private String descricao;
  private double valorOriginal;

  public Produto(String descricao, double valorOriginal) {
    this.descricao = descricao;
    this.valorOriginal = valorOriginal;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getValorOriginal() {
    return valorOriginal;
  }

  public void setValorOriginal(double valorOriginal) {
    this.valorOriginal = valorOriginal;
  }

  /**
   * método abstrato para aplicar desconto ao produto, a ser implementado pelas subclasses
   * @param porcentagem percentual de desconto a ser aplicado (0-50%)
   */
  public abstract void aplicarDesconto(double porcentagem);
}
