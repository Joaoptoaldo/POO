public class NaveCombate extends NaveEspacial {
  private int numeroArmas;
  private boolean escudoAtivado;

  public NaveCombate(String identificador, double combustivelMaximo, double velocidadeBase, int numeroArmas, boolean escudoAtivado) {
    super(identificador, combustivelMaximo, velocidadeBase);
    this.numeroArmas = numeroArmas;
    this.escudoAtivado = escudoAtivado;
  }

  public int getNumeroArmas() {
    return numeroArmas;
  }

  public boolean isEscudoAtivado() {
    return escudoAtivado;
  }

  public void setNumeroArmas(int numeroArmas) {
    this.numeroArmas = numeroArmas;
  }

  public void setEscudoAtivado(boolean escudoAtivado) {
    this.escudoAtivado = escudoAtivado;
  }

  /**
    * calcula o consumo da nave de combate pela distância percorrida e pelo estado do escudo
    * @param distancia a distância percorrida
    * @return o consumo de combustível
  */
  @Override
  public double calcularConsumo(double distancia) {
    double consumoBase = distancia * 0.8;

    if (escudoAtivado) {
      consumoBase *= 1.15;
    }

    return consumoBase;
  }
}
