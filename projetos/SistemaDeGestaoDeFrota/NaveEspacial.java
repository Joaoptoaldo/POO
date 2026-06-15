public abstract class NaveEspacial {
  private String identificador;
  private double combustivelMaximo = 0.0;
  private double combustivelAtual = 0.0;
  private double velocidadeBase = 0.0;


  public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
    this.identificador = identificador;
    this.combustivelMaximo = combustivelMaximo;
    this.velocidadeBase = velocidadeBase;
    this.combustivelAtual = combustivelMaximo;
  }

  public String getIdentificador() {
    return identificador;
  }


  public double getCombustivelMaximo() {
    return combustivelMaximo;
  }


  public double getCombustivelAtual() {
    return combustivelAtual;
  }


  public double getVelocidadeBase() {
    return velocidadeBase;
  }


  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }


  public void setCombustivelMaximo(double combustivelMaximo) {
    this.combustivelMaximo = combustivelMaximo;
  }


  /**
    * define o combustível atual, mantendo o valor entre zero e o máximo permitido
    * @param combustivelAtual o valor do combustível atual a ser definido
   */
  public void setCombustivelAtual(double combustivelAtual) {
    if (combustivelAtual < 0 || combustivelAtual > this.combustivelMaximo) {
      throw new CombustivelInvalidoException("Valor de combustível inválido!");
    }

    this.combustivelAtual = combustivelAtual;
  }


  public void setVelocidadeBase(double velocidadeBase) {
    this.velocidadeBase = velocidadeBase;
  }

  public abstract double calcularConsumo(double distanciaEmAnosLuz);


  /**
    * realiza a viagem, consumindo combustível conforme a distância informada
    * @param distancia a distância a ser percorrida em anos-luz
    * @throws CombustivelInsuficienteException se o combustível atual for insuficiente para realizar a viagem
   */
  public void viajar(double distancia) throws CombustivelInsuficienteException {
    double consumo = calcularConsumo(distancia);
    if (combustivelAtual >= consumo) {
      combustivelAtual -= consumo;
      System.out.println("A nave " + identificador + " viajou " + distancia + " anos-luz. Combustível restante: " + combustivelAtual);
    } else {
      throw new CombustivelInsuficienteException("Combustível insuficiente para a viagem.");
    }
  }

}