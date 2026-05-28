public abstract class Veiculo {
  private String placa;
  private double capacidadeCarga;

  public Veiculo(String placa, double capacidadeCarga) {
    this.placa = placa;
    this.capacidadeCarga = capacidadeCarga;
  }


  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }


  public double getCapacidadeCarga() {
    return capacidadeCarga;
  }


  public void setCapacidadeCarga(double capacidadeCarga) {
    this.capacidadeCarga = capacidadeCarga;
  }


  /**
   * método para registrar manutenção do veículo
   */
  protected void registrarManutencao() {
    System.out.println("Manutenção registrada para o veículo com placa: " + placa);
  }

  /**
   * método abstrato para iniciar a viagem do veículo
   */
  public abstract void iniciarViagem();
}
