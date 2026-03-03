import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = leitor.nextDouble();
        
        // Op
        double soma = n1 + n2;
        double sub = n1 - n2;    
        double mult = n1 * n2;
        double div = n1 / n2;

        // resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);

        leitor.close();
    }
}
