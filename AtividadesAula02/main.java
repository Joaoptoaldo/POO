package Atividades_Aula_02;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		
//		int n;
//		System.out.println("Digite um numero: ");
//		n = teclado.nextInt();
//		System.out.println("Inteiro digitado: "+n);
//		
//		double n2;
//		System.out.println("Digite um inteiro: ");
//		n2 = teclado.nextDouble();
//		System.out.println("Double digitado: "+n2);
//		
//		
//		String palavra;
//		System.out.println("Digite a palavra");
//		teclado.nextLine(); //pegar o Enter perdido no buffer
//		palavra = teclado.nextLine();
//		System.out.println("String digitada: "+palavra);
//		
//		System.out.println("Digite novamente: ");
//		palavra = teclado.nextLine();
//		System.out.println("String digitada: "+palavra);
//		
	
		/*
		 * for(int i = 0; i < 10; i++){ if(i == 7) { break; } if(i == 5) { continue; }
		 * System.out.println("I vale: "+i); }
		 */
		
		/*
		 * int i = 0; while(i<10) { System.out.println("I vale com while: "+i); i++; }
		 */
		
//		int i = 0;
//		do {
//			System.out.println("I vale com while: "+i);
//			i++;
//		}while(i<10);
//
//		teclado.close();


		int[][] matriz = new int [2][3];
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite o elemento ["+i+"]["+j+"]:");
				matriz[i][j] = teclado.nextInt();
			}
		}
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}

//4, 5, 8, 10; 

