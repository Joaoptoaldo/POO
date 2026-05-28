public class Main {
  public static void main(String[] args) {
    Guerreiro guerreiro = new Guerreiro("Guerreiro", 40);
    Mago mago = new Mago("Mago", 35);
    Paladino paladino = new Paladino("Paladino", 45);

    try {
      while (mago.getPontosVida() > 0) {
        guerreiro.atacar(mago);
        System.out.println("Vida de " + mago.getNome() + ": " + mago.getPontosVida());
      }

      System.out.println("\nTentando atacar um personagem já derrotado...");
      guerreiro.atacar(mago);
    } catch (AlvoInvalidoException e) {
      System.out.println("Exceção capturada: " + e.getMessage());
    }

    try {
      paladino.curarAliado(guerreiro);
      System.out.println(guerreiro.getNome() + " agora tem " + guerreiro.getPontosVida() + " pontos de vida");
    } catch (AlvoInvalidoException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}