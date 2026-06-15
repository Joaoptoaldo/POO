public class VanRefrigerada extends Veiculo implements Rastreador, Refrigerado {

  public VanRefrigerada(String placa, double capacidadeCarga) {
    super(placa, capacidadeCarga);
  }

  @Override
  public void iniciarViagem() {
    System.out.println("Van refrigerada iniciando viagem com placa: " + getPlaca());
  }

  @Override
  public String obterLocalizacao() {
    return "Localização da van refrigerada com placa: " + getPlaca();
  }

  @Override
  public void ajustarTemperatura(double graus) throws TemperaturaCriticaException {
    if (graus < -20 || graus > 10) {
      throw new TemperaturaCriticaException("Temperatura fora do intervalo seguro para transporte de cargas refrigeradas: " + graus + "°C");
    }
    System.out.println("Temperatura ajustada para " + graus + "°C na van refrigerada com placa: " + getPlaca());
  }

}
