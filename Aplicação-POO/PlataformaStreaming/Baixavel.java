public interface Baixavel {
  /**
   * método para realizar o download de uma mídia
   * @param conexaoEstavel indica se a conexão é estável ou não
   * @throws FalhaNoDownloadException se a conexão não for estável, com uma mensagem indicando o título da mídia que falhou
   */
  void realizarDownload(boolean conexaoEstavel) throws FalhaNoDownloadException;
}
