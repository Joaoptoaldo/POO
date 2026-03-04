package pkg;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
		        int n, fatorial = 1; // Número a calcular
		        
		        System.out.println("Informe um numero: ");
		        n = teclado.nextInt();

		        for (int i = n; i <= n; i++) {
		            fatorial *= i;
		        }
		        
		        System.out.println("Fatorial de " + n + " é: " + fatorial);
		  
	}


}
