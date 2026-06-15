public class Professor extends MembroAcademico implements Pesquisador, Avaliador {

  public Professor(String nome, String matricula) {
    super(nome, matricula);
  }

  @Override
  public void mostrarFuncao() {
    System.out.println("Professor");
  }

  @Override
  public void publicarArtigo(String titulo) {
    if (titulo == null || titulo.trim().isEmpty()) {
      throw new DadosAcademicosInvalidosException("Título vazio ou nulo");
    }
    System.out.println("Artigo publicado: " + titulo);
  }

  @Override
  public void lancarNotas(double nota) {
    if (nota < 0 || nota > 10) {
      throw new DadosAcademicosInvalidosException("Nota deve ser entre 0 e 10!");
    }
    System.out.println("Nota lançada: " + nota);
  }
}
