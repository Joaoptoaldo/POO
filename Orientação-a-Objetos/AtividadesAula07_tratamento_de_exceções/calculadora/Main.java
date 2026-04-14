package calculadora;

// 1. Calculadora (ArithmeticException)
// Crie um programa que peça ao usuário dois números inteiros e realize a divisão do primeiro pelo segundo. Utilize um bloco try-catch para capturar a ArithmeticException caso o usuário tente dividir por zero, exibindo a mensagem: "Erro matemático: impossível dividir por zero!".
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Num 1: ");
        int a = leitor.nextInt();

        System.out.print("Num 2: ");
        int b = leitor.nextInt();
        
        try {
            int r = a / b;
            System.out.println("Divisão: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: impossível dividir por zero!");
        }
        leitor.close();
    }
}
