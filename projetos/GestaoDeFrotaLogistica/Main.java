public class Main {
  public static void main(String[] args) {
    CaminhaoPadrao caminhao = new CaminhaoPadrao("Caminhão Padrão 1", 5000.0);
    
    VanRefrigerada van1 = new VanRefrigerada("Van Refrigerada 1", 1000.0);
    VanRefrigerada van2 = new VanRefrigerada("Van Refrigerada 2", 1200.0);

    caminhao.iniciarViagem();
    System.out.println(caminhao.obterLocalizacao());
    van2.iniciarViagem();
    System.out.println(van2.obterLocalizacao());

    try {
      van1.ajustarTemperatura(15.0);
    } catch (TemperaturaCriticaException e) {
      System.out.println("Erro ao ajustar temperatura: " + e.getMessage());
    }

    try {
      van1.ajustarTemperatura(2.0);
      System.out.println("Temperatura da van ajustada para 2.0°C.");
    } catch (TemperaturaCriticaException e) {
      System.out.println("Erro ao ajustar temperatura: " + e.getMessage());
    }

  }
}
