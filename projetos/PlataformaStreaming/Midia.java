public abstract class Midia {
  private String titulo;
  private int duracaoSegundos;

  public Midia(String titulo, int duracaoSegundos) {
    this.titulo = titulo;
    setDuracaoSegundos(duracaoSegundos);
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracaoSegundos() {
    return duracaoSegundos;
  }

  /**
   * define a duração da mídia 
   * @param duracaoSegundos a duração da mídia em segundos, deve ser um valor não negativo
   */
  public void setDuracaoSegundos(int duracaoSegundos) {
    if (duracaoSegundos < 0) {
      throw new IllegalArgumentException("Duração não pode ser negativa");
    }
    this.duracaoSegundos = duracaoSegundos;
  }

  public abstract void reproduzir();
}
