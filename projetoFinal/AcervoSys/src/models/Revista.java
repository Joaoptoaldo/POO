package models;

import exceptions.ItemIndisponivelException;

public class Revista extends ItemAcervo {
  private int edicao;

  /**
   * construtor padrão (sem parâmetros)
   */
  public Revista() {
    super();
    this.edicao = 1;
  }

  /**
   * construtor parametrizado completo
   */
  public Revista(String titulo, String autor, boolean disponivel, int edicao) {
    super(titulo, autor, disponivel);
    setEdicao(edicao);
  }

  /**
   * construtor parametrizado (disponibilidade padrão como true)
   */
  public Revista(String titulo, String autor, int edicao) {
    super(titulo, autor);
    setEdicao(edicao);
  }

  public int getEdicao() {
    return edicao;
  }

  /**
   * método que define a edição da revista
   * @param edicao número da edição
   */
  public void setEdicao(int edicao) {
    if (edicao <= 0) {
      throw new IllegalArgumentException("O número da edição deve ser positivo!");
    }
    this.edicao = edicao;
  }

  @Override
  public int calcularPrazoDevolucao() {
    return 7; // prazo de devolução de 7 dias
  }

  @Override
  public void emprestar() throws ItemIndisponivelException {
    if (!isDisponivel()) {
      throw new ItemIndisponivelException("A revista edição nº " + getEdicao() + " não está disponível");
    }
    setDisponivel(false);
  }

  @Override
  public String toString() {
    return "[Revista] " + super.toString();
  }
}
