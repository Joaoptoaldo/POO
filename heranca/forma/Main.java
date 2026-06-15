package forma;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Vermelho", 5.0);
        
        System.out.println("Cor do círculo: " + c1.getCor());
        System.out.println("Raio do círculo: " + c1.getRaio());
    }
}
