package alimentador;

// Crie uma classe AlimentadorPet com o método liberarRacao(int quantidadeGramas). A capacidade máxima da tigela da gata é de 100 gramas. Se o sistema tentar liberar uma quantidade negativa, lance IllegalArgumentException. Se tentar liberar mais de 100 gramas, lance IllegalStateException ("A tigela vai transbordar!"). Trate ambas as exceções no main usando blocos catch separados.
public class Main {
    public static void main(String[] args) {
        AlimentadorPet a = new AlimentadorPet();
        try {
            a.liberarRacao(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }

        try {
            a.liberarRacao(150);
        } catch (IllegalStateException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }
    }
}
