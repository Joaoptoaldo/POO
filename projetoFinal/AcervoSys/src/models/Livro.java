package models;

import java.time.Year;

import exceptions.ItemIndisponivelException;

public class Livro extends ItemAcervo {
  private int anoPublicacao;

  /**
   * construtor padrão (sem parâmetros)
   */
  public Livro() {
    super();
    this.anoPublicacao = Year.now().getValue();
  }

  /**
   * construtor parametrizado completo
   */
  public Livro(String titulo, String autor, boolean disponivel, int anoPublicacao) {
    super(titulo, autor, disponivel);
    setAnoPublicacao(anoPublicacao);
  }

  /**
   * construtor parametrizado (disponibilidade padrão como true)
   */
  public Livro(String titulo, String autor, int anoPublicacao) {
    super(titulo, autor);
    setAnoPublicacao(anoPublicacao);
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  /**
   * método que define o ano de publicação do livro
   * @param anoPublicacao ano de publicação
   */
  public void setAnoPublicacao(int anoPublicacao) {
    int anoAtual = Year.now().getValue(); //pega o ano atual automaticamente
    if (anoPublicacao > anoAtual || anoPublicacao < 0) {
        throw new IllegalArgumentException("Ano de publicação inválido");
    }
    this.anoPublicacao = anoPublicacao;
  }

  @Override
  public int calcularPrazoDevolucao() {
    return 14; // prazo de devolução de 14 dias
  }

  @Override
  public void emprestar() throws ItemIndisponivelException {
    if (!isDisponivel()) {
      throw new ItemIndisponivelException("O livro '" + getTitulo() + "' já se encontra emprestado");
    }
    setDisponivel(false);
  }

  @Override
  public String toString() {
    return "[Livro] " + super.toString();
  }
}