import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<NaveEspacial> naves = new ArrayList<>();

    NaveCargueiro cargueiro = new NaveCargueiro(
        "Cargueiro01",
        5000,      
        500,  
        800,  
        1000       
    );

    NaveCombate combate = new NaveCombate(
        "Combate01",
        3000,     
        1000,     
        5,         
        false      
    );

    NaveExploracao exploracao = new NaveExploracao(
        "Exploracao01",
        2000,    
        800,      
        true       
    );

    naves.add(cargueiro);
    naves.add(combate);
    naves.add(exploracao);

    try {
      cargueiro.setCombustivelAtual(6000);
      System.out.println("Combustível do cargueiro atualizado com sucesso.");
    } catch (CombustivelInvalidoException e) {
      System.out.println("ERRO: " + e.getMessage());
    }

    for (NaveEspacial nave : naves) {
      System.out.println("\nTipo de Nave: " + nave.getClass().getSimpleName() + ", Identificador: " + nave.getIdentificador());
      System.out.println("Combustível antes da viagem: " + nave.getCombustivelAtual());

      try {
        nave.viajar(1000);
      } catch (CombustivelInsuficienteException e) {
        System.out.println("ERRO: " + e.getMessage());
      }

      System.out.println("Combustível após a viagem: " + nave.getCombustivelAtual());
    }
  }
}
