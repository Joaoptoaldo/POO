public abstract class MembroAcademico {
  private String nome;
  private String matricula;

  public MembroAcademico(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public String getMatricula() {
    return matricula;
  }

  /** 
   * método abstrato para mostrar a função do membro acadêmico
   */
  public abstract void mostrarFuncao();
}
