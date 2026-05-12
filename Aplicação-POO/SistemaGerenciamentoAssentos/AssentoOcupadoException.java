package SistemaGerenciamentoAssentos;

public class AssentoOcupadoException extends Exception {
  /**
   * construtor da classe 
   * @param msg mensagem de erro a ser exibida quando a exceção for lançada
   */
  public AssentoOcupadoException(String msg) {
    super(msg);
  }
}
