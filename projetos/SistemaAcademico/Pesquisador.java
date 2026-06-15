public interface Pesquisador {
  /**
   * método para publicar um artigo. Se o título for vazio ou nulo, deve lançar a exceção DadosAcademicosInvalidosException.
   * @param titulo título do artigo a ser publicado
   */
  void publicarArtigo(String titulo);
}
