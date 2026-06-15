public interface Refrigerado extends Rastreador {
  /**
   * método para ajustar a temperatura do compartimento refrigerado
   * @param graus temperatura em graus Celsius a ser ajustada, deve estar entre -20 e 10 graus
   * @throws TemperaturaCriticaException exceção lançada quando a temperatura está fora do intervalo seguro para transporte
   */
  void ajustarTemperatura(double graus) throws TemperaturaCriticaException;
}
