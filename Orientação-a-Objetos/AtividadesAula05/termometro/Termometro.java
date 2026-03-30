//7 -Crie uma classe Termometro que armazena a temperatura em celsius . 
// Crie um getFahrenheit() que faz a conversão e um setFahrenheit(double f) 
// que converte para Celsius antes de armazenar.
package termometro;

public class Termometro {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit(){
        return (celsius * 9/5) + 32;
    }

    public void setFahrenheit(double f){
        this.celsius = (f - 32) * 5/9;
    }
}
