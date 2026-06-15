public interface Magico {
  
  /**
   * método para lançar um feitiço em um alvo
   * @param alvo personagem a ser atacado
   * @throws AlvoInvalidoException se o alvo já estiver com 0 pontos de vida
   */
  public void lancarFeitico(Personagem alvo) throws AlvoInvalidoException;
}

