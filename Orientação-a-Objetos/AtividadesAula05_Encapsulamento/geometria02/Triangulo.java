package geometria02;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // construtor que recebe os 3 e testa se formam um triângulo
    public Triangulo(double a, double b, double c) {
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            this.ladoA = a;
            this.ladoB = b;
            this.ladoC = c;
        } 
        
        else {
            System.out.println("Valores inválidos! Criando triângulo padrão (1, 1, 1).");
            this.ladoA = 1;
            this.ladoB = 1;
            this.ladoC = 1;
        }
    }

    public void setLadoA(double novoA) {
        // valida se o novo lado A ainda respeita a regra com os lados B e C atuais
        if (novoA < this.ladoB + this.ladoC && this.ladoB < novoA + this.ladoC && this.ladoC < novoA + this.ladoB) {
            this.ladoA = novoA;
            System.out.println("Lado A alterado para: " + novoA);
        } else {
            System.out.println("Erro: O valor " + novoA + " não forma um triângulo com os outros lados!");
        }
    }


    public double getLadoA() {
        return ladoA;
    }
}