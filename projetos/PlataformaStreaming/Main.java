import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Midia> playlist = new ArrayList<>();

    playlist.add(new Musica("After Dark", 180));
    playlist.add(new Filme("Interstellar", 7200));
    playlist.add(new Podcast("NerdCast", 3600));
    playlist.add(new Musica("Ritmo Urbano", 210));

    for (Midia m : playlist) {
      if (m instanceof Baixavel) {
        Baixavel b = (Baixavel) m;
        try {
          // força falha de download
          b.realizarDownload(false);
        } catch (FalhaNoDownloadException e) {
          System.out.println("Aviso: " + e.getMessage());
        }
      }

      if (m instanceof Compartilhavel) {
        Compartilhavel c = (Compartilhavel) m;
        System.out.println("Link: " + c.gerarLink());
      }

      m.reproduzir();
      System.out.println();
    }
  }
}
