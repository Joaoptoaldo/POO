package contaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria(1000.0, 500.0);

        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Limite: " + conta.getLimite());
        System.out.println("Digite o valor para saque: ");
        double valorSaque = leitor.nextDouble();

        conta.Sacar(valorSaque);

        System.out.println("Saldo após o saque: " + conta.getSaldo());
    }
}
