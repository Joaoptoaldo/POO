public class NaveCargueiro extends NaveEspacial {
  private double pesoCargaAtual;
  private double capacidadeMaximaCarga;

  public NaveCargueiro(String identificador, double combustivelMaximo, double velocidadeBase, double pesoCargaAtual, double capacidadeMaximaCarga) {
    super(identificador, combustivelMaximo, velocidadeBase);

    this.capacidadeMaximaCarga = capacidadeMaximaCarga;

    if (pesoCargaAtual < 0 || pesoCargaAtual > this.capacidadeMaximaCarga) {
      throw new IllegalArgumentException("Valor de carga inválido!");
    }

    this.pesoCargaAtual = pesoCargaAtual;
  }

  public double getPesoCargaAtual() {
    return pesoCargaAtual;
  }

  public double getCapacidadeMaximaCarga() {
    return capacidadeMaximaCarga;
  }

  /**
    * define o peso da carga atual, respeitando a capacidade máxima da nave
    * @param pesoCargaAtual o peso da carga atual a ser definido para a nave cargueira
    * @throws IllegalArgumentException se o peso informado for inválido
   */
  public void setPesoCargaAtual(double pesoCargaAtual) {
    if (pesoCargaAtual < 0 || pesoCargaAtual > this.capacidadeMaximaCarga) {
      throw new IllegalArgumentException("Valor de carga inválido!");
    }
    this.pesoCargaAtual = pesoCargaAtual;
  }

  public void setCapacidadeMaximaCarga(double capacidadeMaximaCarga) {
    this.capacidadeMaximaCarga = capacidadeMaximaCarga;
  }

  /**
    * calcula o consumo da nave cargueira pela distância e pela carga atual
    * @param distancia a distância percorrida
    * @return o consumo de combustível
   */
  @Override
  public double calcularConsumo(double distancia) {
    return (distancia * 0.5) + (pesoCargaAtual * 0.2);
  }
}
