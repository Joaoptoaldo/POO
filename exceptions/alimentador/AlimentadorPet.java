package alimentador;

public class AlimentadorPet {
    public void liberarRacao(int qnt) {
        if (qnt < 0) {
            throw new IllegalArgumentException("Não pode ser negativo");
        }
        if (qnt > 100) {
            throw new IllegalStateException("A tigela vai transbordar!");
        }
        System.out.println("Liberou " + qnt + "g de ração");
    }
}
