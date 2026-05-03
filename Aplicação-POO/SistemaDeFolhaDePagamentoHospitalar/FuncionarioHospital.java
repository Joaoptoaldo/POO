public abstract class FuncionarioHospital {
  private String nome;
  private String matricula;
  private double salarioBase;
  private int horasTrabalhadasMensais = 0;
  private static final double salarioMinimo = 1412.00;

  public FuncionarioHospital(String nome, String matricula, double salarioBase) {
    this.nome = nome;
    this.matricula = matricula;
    setSalarioBase(salarioBase);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  /**
    * define o salário base, validando se ele é maior ou igual ao mínimo legal
   * @param salarioBase o salário base a ser definido para o funcionário
    * @throws ValorInvalidoException se o salário base for inferior ao mínimo legal
   */
  public final void setSalarioBase(double salarioBase) {
    if (salarioBase < salarioMinimo) {
      throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal");
    }
    this.salarioBase = salarioBase;
  }

  public int getHorasTrabalhadasMensais() {
    return horasTrabalhadasMensais;
  }

  /**
    * define as horas trabalhadas mensais, aceitando valores entre 0 e 300
    * @param horasTrabalhadasMensais as horas trabalhadas mensais a serem definidas para o funcionário
    * @throws ValorInvalidoException se o valor informado for negativo ou maior que 300
   */
  public final void setHorasTrabalhadasMensais(int horasTrabalhadasMensais) {
    if (horasTrabalhadasMensais < 0 || horasTrabalhadasMensais > 300) {
      throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas");
    }
    this.horasTrabalhadasMensais = horasTrabalhadasMensais;
  }

  /**
    * exibe o resumo mensal dos funcionários
   */
  public void exibirResumoMensal() {
    System.out.println("--- Resumo do Funcionário ---");
    System.out.println("Nome: " + getNome());
    System.out.println("Matrícula: " + getMatricula());
    System.out.println("Horas Trabalhadas no Mês: " + getHorasTrabalhadasMensais());
    System.out.printf("Salário Final: R$ %.2f%n", calcularSalarioFinal());
  }

  public abstract double calcularSalarioFinal();

}
