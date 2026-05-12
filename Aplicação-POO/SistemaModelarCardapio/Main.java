package SistemaModelarCardapio;

public class Main {
  public static void main(String[] args) {
    PratoPrincipal prato1 = new PratoPrincipal("Xis", 25.0, 15.0) {
     
      @Override
      public double calcularPrecoFinal() {
        return getPrecoBase() + (getTempoPreparo());
      }
    };

    Bebida bebida1 = new Bebida("Coca-Cola", 5.0, false) {

      @Override
      public double calcularPrecoFinal() {
        if (isAlcoolica()) {
          return getPrecoBase() * 1.10; 
        } else {
          return getPrecoBase();
        }
      }
    };

    System.out.println("Preço final do prato: " + prato1.calcularPrecoFinal());
    System.out.println("Preço final da bebida: " + bebida1.calcularPrecoFinal());
  }
}
