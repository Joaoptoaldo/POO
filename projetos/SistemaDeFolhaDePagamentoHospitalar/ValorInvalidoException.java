public class ValorInvalidoException extends RuntimeException {

  /**
    * cria a exceção com a mensagem informada
    * @param message a mensagem de erro
   */
  public ValorInvalidoException(String message) {
    super(message);
  }
}