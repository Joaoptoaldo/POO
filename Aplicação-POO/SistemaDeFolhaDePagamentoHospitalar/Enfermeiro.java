public class Enfermeiro extends FuncionarioHospital {
  private String setor;
  private double percentualInsalubridade;
  private static final int cargaHorariaPadrao = 160;
  private static final double valorHoraExtra = 50.0;

  public Enfermeiro(String nome, String matricula, double salarioBase, String setor, double percentualInsalubridade) {
    super(nome, matricula, salarioBase);
    this.setor = setor;
    setPercentualInsalubridade(percentualInsalubridade);
  }

  public String getSetor() {
    return setor;
  }

  public void setSetor(String setor) {
    this.setor = setor;
  }

  public double getPercentualInsalubridade() {
    return percentualInsalubridade;
  }

  /**
    * define o percentual de insalubridade, aceitando apenas 10%, 20% ou 40%
    * @param percentualInsalubridade o percentual de insalubridade a ser definido para o enfermeiro
    * @throws ValorInvalidoException se o percentual informado for inválido
   */
  public final void setPercentualInsalubridade(double percentualInsalubridade) {
    boolean percentualValido = percentualInsalubridade == 0.10
        || percentualInsalubridade == 0.20
        || percentualInsalubridade == 0.40;

    if (!percentualValido) {
      throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato");
    }

    this.percentualInsalubridade = percentualInsalubridade;
  }

  /**
    * calcula o salário final do enfermeiro, somando insalubridade e horas extras
    * @return o salário final do enfermeiro
   */
  @Override
  public double calcularSalarioFinal() {
    double bonusInsalubridade = getSalarioBase() * percentualInsalubridade;
    int horasExtras = Math.max(0, getHorasTrabalhadasMensais() - cargaHorariaPadrao);
    double valorHorasExtras = horasExtras * valorHoraExtra;
    return getSalarioBase() + bonusInsalubridade + valorHorasExtras;
  }

}
