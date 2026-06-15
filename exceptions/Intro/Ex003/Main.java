
import java.util.Scanner;

public class Main {
    // 3 - Faça o tratamento de exceções em conversões de valores lidos pelo
    // teclado.
    // Por exemplo, ao ler uma string e converter ela para double

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numeroStr = leitor.nextLine();

        try {
            double numero = Double.parseDouble(numeroStr);
            System.out.println("O número digitado é: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, digite um número válido");
        } catch (Exception e) {
            System.out.println("Error: Ocorreu um erro inesperado");
        } finally {
            leitor.close();
        }
    }
}
