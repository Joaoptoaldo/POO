public class AlunoPosGraduacao extends MembroAcademico implements Pesquisador {

  public AlunoPosGraduacao(String nome, String matricula) {
    super(nome, matricula);
  }

  @Override
  public void mostrarFuncao() {
    System.out.println("Aluno de pós-graduação");
  }

  @Override
  public void publicarArtigo(String titulo) {
    if (titulo == null || titulo.trim().isEmpty()) {
      throw new DadosAcademicosInvalidosException("Título vazio ou nulo.");
    }
    System.out.println("Artigo publicado: " + titulo);
  }
}
