package cronometro;

public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();

        System.out.println("Segundos iniciais: " + cronometro.getSegundos());

        // simulando o passar do tempo
        for (int i = 0; i < 5; i++) {
            cronometro.passarTempo();
            System.out.println("Segundos após passar tempo: " + cronometro.getSegundos());
        }
    }
}
