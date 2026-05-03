public class Medico extends FuncionarioHospital {
  private String especialidade;
  private double valorPorPlantao;
  private int quantidadePlantoes;

  public Medico(String nome, String matricula, double salarioBase, String especialidade, double valorPorPlantao, int quantidadePlantoes) {
    super(nome, matricula, salarioBase);
    this.especialidade = especialidade;
    this.valorPorPlantao = valorPorPlantao;
    setQuantidadePlantoes(quantidadePlantoes);
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public double getValorPorPlantao() {
    return valorPorPlantao;
  }

  public void setValorPorPlantao(double valorPorPlantao) {
    this.valorPorPlantao = valorPorPlantao;
  }

  public int getQuantidadePlantoes() {
    return quantidadePlantoes;
  }

  /**
    * define a quantidade de plantões, sem aceitar valores negativos
    * @param quantidadePlantoes a quantidade de plantões a ser definida para o médico
    * @throws ValorInvalidoException se a quantidade de plantões for negativa
   */
  public final void setQuantidadePlantoes(int quantidadePlantoes) {
    if (quantidadePlantoes < 0) {
      throw new ValorInvalidoException("Quantidade de plantões não pode ser negativa.");
    }
    this.quantidadePlantoes = quantidadePlantoes;
  }

  /**
    * calcula o salário final do médico somando o salário base aos plantões
    * @return o salário final do médico
   */
  @Override
  public double calcularSalarioFinal() {
    return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
  }

}
