//3 - Crie uma classe Retangulo com largura e altura privados. 
// Crie um método getArea() que calcula o valor no momento da chamada.
package geometria01;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getArea() {
        return this.largura * this.altura;
    }
}
