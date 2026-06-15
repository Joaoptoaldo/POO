package laboratorio;

import java.util.Scanner; 

public class Laboratorio {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Professor f1 = new Professor();
		System.out.print("Informe o nome: ");
        f1.nome = leitor.nextLine();
        
        System.out.println("O nome do professor é: "+f1.nome+"\nO local é na sala 108");
        
	}
}
