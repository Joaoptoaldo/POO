import java.util.Scanner;

public class executaConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ContaCorrente conta1 = new ContaCorrente();
        
        // INICIA SALDO INICIAL   3
        conta1.SaldoInicial(1000);
        System.out.print("Digite o nome do titular: ");
        conta1.titular = leitor.nextLine();

        // exibir confirmação
        System.out.println("Titular cadastrado: " + conta1.titular);
        System.out.println("Saldo inicial: R$ " + conta1.saldo);
        
        // menu
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n--- MENU CONTA CORRENTE ---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depositar: R$ ");
                    double deposito = leitor.nextDouble();
                    conta1.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar: R$ ");
                    double saque = leitor.nextDouble();
                    conta1.sacar(saque);
                    break;
                case 3:
                    conta1.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        leitor.close();
    }
}
