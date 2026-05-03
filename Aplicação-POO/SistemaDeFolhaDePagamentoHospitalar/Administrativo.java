public class Administrativo extends FuncionarioHospital {
  private String departamento;
  private boolean cargoDeGestao;
  private static final double bonusGestao = 1500.00;

  public Administrativo(String nome, String matricula, double salarioBase, String departamento, boolean cargoDeGestao) {
    super(nome, matricula, salarioBase);
    this.departamento = departamento;
    this.cargoDeGestao = cargoDeGestao;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public boolean isCargoDeGestao() {
    return cargoDeGestao;
  }

  public void setCargoDeGestao(boolean cargoDeGestao) {
    this.cargoDeGestao = cargoDeGestao;
  }

  /**
    * calcula o salário final do administrativo, somando o bônus de gestão quando houver
    * @return o salário final do administrativo
   */
  @Override
  public double calcularSalarioFinal() {
    return cargoDeGestao ? getSalarioBase() + bonusGestao : getSalarioBase();
  }

}
