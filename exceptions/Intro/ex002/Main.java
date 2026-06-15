import java.util.Scanner;

public class Main {
  //2 - faça o tratamento de exceções em uma calculadora
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      double num1, num2;

      System.out.println("Digite o primeiro número: ");
      num1 = leitor.nextDouble();
      System.out.println("Digite o segundo número: ");
      num2 = leitor.nextDouble();

      try {
          double resultado = num1 / num2;
          System.out.println("O resultado da divisão é: " + resultado);
      } catch (ArithmeticException e) {//ArithmeticException é a exceção lançada quando ocorre uma divisão por zero
          System.out.println("Error: Divisão por zero não é permitida");
      } catch (Exception e) {
          System.out.println("Error: Ocorreu um erro inesperado");
      } finally {
          leitor.close();
      }
  }
}

