package pkg;

import java.util.Scanner;

public class ex03 {
		public static void main(String[] args) {
			//8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.
			Scanner teclado = new Scanner(System.in);
			
			String cidade;
		
			while(true) {
				System.out.println("Digite uma cidade: ");
				cidade = teclado.nextLine();
				
				if(cidade.equalsIgnoreCase("São Paulo")) {
					System.out.println("Saindo...");
					break;					
					
				}while(!cidade.equalsIgnoreCase("São Paulo"));

			}
		}

}
