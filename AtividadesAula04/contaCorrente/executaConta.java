package contaCorrente;
import java.util.Scanner;

public class executaConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        ContaCorrente conta1 = new ContaCorrente();
       //INICIA SALDO INICIAL   
        conta1.SaldoInicial(1000);
        System.out.print("Digite o nome do titular: ");
        conta1.titular = leitor.nextLine(); // antes: leu em variável local 'titular'

        // Mudança: exibir confirmação usando os campos do objeto
        System.out.println("Titular cadastrado: " + conta1.titular);

        // Opcional: inicialização explícita do saldo (se desejado)
        // conta1.saldo = 0.0; // comente/descomente conforme necessário
        System.out.println("Saldo atual: " + conta1.saldo);

        // Mudança: fechar Scanner para liberar recurso
        leitor.close();
    }
}
