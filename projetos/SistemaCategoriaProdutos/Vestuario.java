package SistemaCategoriaProdutos;

public class Vestuario extends Produto implements Tributavel {

  public Vestuario(String descricao, double valorOriginal) {
    super(descricao, valorOriginal);
  }

  @Override
  public double calcularImposto() {
    return getValorOriginal() * 0.05;
  }

  @Override
  public void aplicarDesconto(double percentual) {
    if (percentual < 0 || percentual > 50) {
    throw new IllegalArgumentException("Operação Inválida - Desconto fora da margem permitida (0-50%)");
  }
    double valorDesconto = getValorOriginal() * (percentual / 100);
    setValorOriginal(getValorOriginal() - valorDesconto);
  }
}
