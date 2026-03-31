//Crie uma classe Veiculo com atributo velocidade, 
//e crie Carro que herda de Veiculo e adicione o método acelerar().
package veiculo;

public class Veiculo {
    protected double velocidade;

    public Veiculo(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
