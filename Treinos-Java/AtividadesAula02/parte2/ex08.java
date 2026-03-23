package parte2;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int countPares = 0;
        int countImpares = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                countPares++;
            } else {
                countImpares++;
            }
        }
        
        System.out.println("Quantidade de números pares: " + countPares);
        System.out.println("Quantidade de números ímpares: " + countImpares);
    }
}
