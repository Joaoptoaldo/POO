public class CombustivelInvalidoException extends IllegalArgumentException {
  /**
   * construtor para criar uma nova instância de CombustivelInvalidoException com uma mensagem personalizada
   * @param mensagem a mensagem de erro
   */
  public CombustivelInvalidoException(String mensagem) {
    super(mensagem);
  }
}