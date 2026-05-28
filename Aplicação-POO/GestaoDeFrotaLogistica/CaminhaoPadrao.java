public class CaminhaoPadrao extends Veiculo implements Rastreador {

  public CaminhaoPadrao(String placa, double capacidadeCarga) {
    super(placa, capacidadeCarga);
  }

  @Override
  public void iniciarViagem() {
    System.out.println("Caminhão padrão iniciando viagem com placa: " + getPlaca());
  }

  @Override
  public String obterLocalizacao() {
    return "Localização do caminhão padrão com placa: " + getPlaca();
  }

}
