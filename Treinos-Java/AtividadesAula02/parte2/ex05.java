package parte2;

import java.util.Scanner;

public class ex05 {
    //5 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = leitor.nextInt();
        }
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        
        leitor.close();
    }
}
