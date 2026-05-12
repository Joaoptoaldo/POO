package SistemaGerenciamentoAssentos;

public class Main {
  public static void main(String[] args) {
    Voo voo1 = new Voo("AB123", "POA");

    try {
      voo1.reservarAssento(10);
      voo1.reservarAssento(10); 

    } catch (IllegalArgumentException | AssentoOcupadoException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
