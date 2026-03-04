package pkg;

import java.util.Scanner;

public class ex04 {
	Scanner teclado = new Scanner(System.in);
	//10 - Escreva um programa Java que use um laço para calcular a média de vários números reais lidos do usuário até que seja lido o número 0.
	public static void main(String[] args) {
		double n, somatorio = 0, media;
		int contador= 0;
		
		while(true) {
			System.out.println("Digite um valor: ");
			n = teclado.nextDouble();
			
			somatorio = somatorio + n;
			if(n == 0) {
				break;
			}
			contador ++;
		}
		media = somatorio / contador;
		System.out.println("media"+media);
	}

}
