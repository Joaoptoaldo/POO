package SistemaGerenciamentoAssentos;

public class Voo {
  private String numeroDovoo;
  private String destino;
  private boolean[] assentos;

  /**
   * construtor da classe
   * @param numeroDovoo - número do voo
   * @param destino - destino do voo
   * inicializa o array de assentos com 100 posições, todas inicialmente disponíveis (false)
   */
  public Voo(String numeroDovoo, String destino) {
    this.numeroDovoo = numeroDovoo;
    this.destino = destino;
    this.assentos = new boolean[100];

    for (int i = 0; i < 100; i++) {
      this.assentos[i] = false;
    }
  }

  public String getNumeroDovoo() {
    return this.numeroDovoo;
  }

  public String getDestino() {
    return this.destino;
  }

  /**
   * método que reserva um assento no voo 
   * @param numeroAssento - número do assento a ser reservado (1-100)
   * @throws IllegalArgumentException: se o número do assento for inválido (menor que 1 ou maior que 100)
   * @throws AssentoOcupadoException: se o assento já estiver reservado
   */
  public void reservarAssento(int numeroAssento) throws IllegalArgumentException, AssentoOcupadoException {
    if (numeroAssento < 1 || numeroAssento > 100) {
      throw new IllegalArgumentException("Número do assento inválido");
    }
    if (this.assentos[numeroAssento - 1]) {
      throw new AssentoOcupadoException("Assento já reservado");
    }
    this.assentos[numeroAssento - 1] = true;
  }
}
