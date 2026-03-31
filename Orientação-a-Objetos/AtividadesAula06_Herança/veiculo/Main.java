package veiculo;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(50); 
        
        System.out.println("Velocidade inicial do carro: " + meuCarro.getVelocidade() + " km/h");
        
        meuCarro.acelerar(); 
    }
}
