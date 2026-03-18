import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //ex09: menu utilizando switch case
        System.out.println("--- MENU DE OPERAÇÕES ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();

        System.out.println("Digite o primeiro número: ");
        double n1 = leitor.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = leitor.nextDouble();
        
        // Op
        double soma = n1 + n2;
        double sub = n1 - n2;    
        double mult = n1 * n2;
        double div = n1 / n2;

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + (n1 + n2));
                break; // O break é essencial para não executar o próximo case!
            case 2:
                System.out.println("Resultado da Subtração: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado da Divisão: " + (n1 / n2));
                } else {
                    System.out.println("Erro: Divisão por zero não permitida!");
                }
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    

        leitor.close();
    
    }
}
