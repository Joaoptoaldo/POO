public abstract class Personagem {
  private String nome;
  private int pontosVida;

  public Personagem(String nome, int pontosVida) {
    this.nome = nome;
    setPontosVida(pontosVida);
  }

  public String getNome() {
    return nome;
  }

  public int getPontosVida() {
    return pontosVida;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPontosVida(int pontosVida) {
    if (pontosVida < 0) {
      throw new IllegalArgumentException("Pontos de vida não podem ser negativos");
    }
    this.pontosVida = pontosVida;
  }

  public void receberDano(int dano) {
    setPontosVida(Math.max(0, getPontosVida() - dano));
  }

  public void receberCura(int pontosCura) {
    setPontosVida(getPontosVida() + pontosCura);
  }

  public boolean estaForaDeCombate() {
    return pontosVida == 0;
  }

  /**
   * método abstrato para atacar outro personagem
   * @param alvo personagem a ser atacado
   * @throws AlvoInvalidoException se o alvo já estiver com 0 pontos de vida
   */
  public abstract void atacar(Personagem alvo) throws AlvoInvalidoException;
}
