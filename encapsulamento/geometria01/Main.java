package geometria01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        double largura = leitor.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = leitor.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);
        double area = retangulo.getArea();
        System.out.println("A área do retângulo é: " + area);

        leitor.close();
    }
}
