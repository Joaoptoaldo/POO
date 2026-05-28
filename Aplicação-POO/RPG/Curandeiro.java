public interface Curandeiro {
  /**
   * método para curar um aliado
   * @param aliado personagem a ser curado
   * @throws AlvoInvalidoException se o aliado já estiver com 0 pontos de vida
   */
  public void curarAliado(Personagem aliado) throws AlvoInvalidoException;
}