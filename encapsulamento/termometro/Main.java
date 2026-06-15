package termometro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Termometro termometro = new Termometro();

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = leitor.nextDouble();

        termometro.setFahrenheit(fahrenheit);

        System.out.println("Resultado da conversão para Celsius: " + termometro.getCelsius());

        leitor.close();
    }
}
