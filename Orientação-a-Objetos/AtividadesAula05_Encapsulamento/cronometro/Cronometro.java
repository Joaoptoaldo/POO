//6 - Crie uma classe Cronometro com o atributo segundos . 
// Implemente um método passarTempo() que incrementa 1 segundo. 
// O usuário não deve ter um setSegundos , apenas o get .

package cronometro;

public class Cronometro {
    private int segundos;

    public Cronometro() {
        this.segundos = 0;
    }

    public void passarTempo() {
        this.segundos++;
    }

    public int getSegundos() {
        return segundos;
    }
}