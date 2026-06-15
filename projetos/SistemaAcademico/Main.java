import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<MembroAcademico> membros = new ArrayList<>();

    membros.add(new Professor("Pedro", "12345"));
    membros.add(new AlunoPosGraduacao("João", "67890"));

    String tituloVazio = "";
    double notaInvalida = 11.0;

    for (MembroAcademico membro : membros) {
      membro.mostrarFuncao();

      if (membro instanceof Pesquisador) {
        try {
          ((Pesquisador) membro).publicarArtigo(tituloVazio);
        } catch (DadosAcademicosInvalidosException e) {
          System.out.println("Erro ao publicar artigo: " + e.getMessage());
        }
      }

      if (membro instanceof Avaliador) {
        try {
          ((Avaliador) membro).lancarNotas(notaInvalida);
        } catch (DadosAcademicosInvalidosException e) {
          System.out.println("Erro ao lançar nota: " + e.getMessage());
        }
      }
    }
  }
}
