public class NaveExploracao extends NaveEspacial {
  private boolean possuiSensoresAvancados;

  public NaveExploracao(String identificador, double combustivelMaximo, double velocidadeBase, boolean possuiSensoresAvancados) {
    super(identificador, combustivelMaximo, velocidadeBase);
    this.possuiSensoresAvancados = possuiSensoresAvancados;
  }

  public boolean isPossuiSensoresAvancados() {
    return possuiSensoresAvancados;
  }

  public void setPossuiSensoresAvancados(boolean possuiSensoresAvancados) {
    this.possuiSensoresAvancados = possuiSensoresAvancados;
  }


  /**
    * calcula o consumo da nave de exploração pela distância percorrida e pelos sensores avançados
    * @param distancia a distância percorrida
    * @return o consumo de combustível
  */
  @Override
  public double calcularConsumo(double distancia) {
    double consumoBase = distancia * 0.3;

    if (possuiSensoresAvancados) {
      consumoBase += 50.0;
    }

    return consumoBase;
  }
}
