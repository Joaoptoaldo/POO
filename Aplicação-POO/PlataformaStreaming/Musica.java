public class Musica extends Midia implements Baixavel, Compartilhavel {

  public Musica(String titulo, int duracaoSegundos) {
    super(titulo, duracaoSegundos);
  }

  @Override
  public void realizarDownload(boolean conexaoEstavel) throws FalhaNoDownloadException {
    if (!conexaoEstavel) {
      throw new FalhaNoDownloadException("Erro de rede: Não foi possível baixar " + getTitulo());
    }
    System.out.println("Download concluído: " + getTitulo());
  }

  @Override
  public String gerarLink() {
    return "http://streaming.local/musica/" + getTitulo().replaceAll("\\s+", "_");
  }

  @Override
  public void reproduzir() {
    System.out.println("Tocando música: " + getTitulo() + " (" + getDuracaoSegundos() + "s)");
  }
}
