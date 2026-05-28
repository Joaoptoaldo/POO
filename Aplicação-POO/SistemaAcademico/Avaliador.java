public interface Avaliador {
  /**
   * método para lançar notas. Se a nota for menor que 0 ou maior que 10, deve lançar a exceção DadosAcademicosInvalidosException.
   * @param nota nota a ser lançada
   */
  void lancarNotas(double nota);
}
