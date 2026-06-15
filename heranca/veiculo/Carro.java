package veiculo;

public class Carro extends Veiculo {
    public Carro(double velocidade) {
        super(velocidade);
    }

    public void acelerar() {
        velocidade += 10; 
        System.out.println("Carro acelerou! Velocidade atual: " + velocidade + " km/h");
    }
}