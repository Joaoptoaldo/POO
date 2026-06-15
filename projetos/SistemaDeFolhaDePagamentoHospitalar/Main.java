import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<FuncionarioHospital> funcionarios = new ArrayList<>();

    Medico medico = new Medico("Dr. João Pedro", "MED-001", 18000.00, "Cirurgia", 1200.00, 5);
    Enfermeiro enfermeiro = new Enfermeiro("Vinicius", "ENF-010", 4000.00, "UTI", 0.40);
    enfermeiro.setHorasTrabalhadasMensais(180);
    Administrativo administrativo = new Administrativo("André", "ADM-021", 3200.00, "Recursos Humanos", true);

    funcionarios.add(medico);
    funcionarios.add(enfermeiro);
    funcionarios.add(administrativo);

    try {
      administrativo.setSalarioBase(900.00);
    } catch (ValorInvalidoException e) {
      mostrarErro(e);
    }

    try {
      enfermeiro.setPercentualInsalubridade(0.99);
    } catch (ValorInvalidoException e) {
      mostrarErro(e);
    }

    try {
      medico.setHorasTrabalhadasMensais(400);
    } catch (ValorInvalidoException e) {
      mostrarErro(e);
    }

    for (FuncionarioHospital funcionario : funcionarios) {
      funcionario.exibirResumoMensal();
      System.out.println();
    }
  }

  private static void mostrarErro(Exception e) {
    System.out.println("ERRO: " + e.getMessage());
  }
}