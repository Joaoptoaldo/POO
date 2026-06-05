package exceptions;

public class ItemIndisponivelException extends Exception {
  /**
   * método para lançar exceção quando o item não está disponível
   * @param msg mensagem da exceção
   */
  public ItemIndisponivelException(String msg) {
    super(msg);
  }
}
