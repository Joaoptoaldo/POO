package Atividades_Aula_02.Parte2;

public class ex08 {
    //8 - Escreva um programa Java que use um vetor para armazenar 10 números inteiros lidos do usuário e depois imprima na tela quantos números são pares e quantos são ímpares.
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int countPares = 0;
        int countImpares = 0;
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        

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
