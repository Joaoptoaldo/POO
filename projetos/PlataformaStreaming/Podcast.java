public class Podcast extends Midia implements Compartilhavel {

  public Podcast(String titulo, int duracaoSegundos) {
    super(titulo, duracaoSegundos);
  }

  @Override
  public String gerarLink() {
    return "http://streaming.local/podcast/" + getTitulo().replaceAll("\\s+", "_");
  }

  @Override
  public void reproduzir() {
    System.out.println("Reproduzindo podcast: " + getTitulo() + " (" + getDuracaoSegundos() + "s)");
  }
}
