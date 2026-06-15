package ex001;

import java.util.Scanner;

//1 - Escreva um programa que solicita ao usúario para digitar um número inteiro e exiba a raiz quadrada desse némero.
//Certifique-se de que o programa trate adequadamente as exceções se o usúario digitar um valor invalido.

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        

        int numero;
        System.out.print("Digite um número inteiro: ");
        numero = leitor.nextInt();

        try {
            if(numero < 0) {
                System.out.println("Número inválido. A raiz quadrada de um número negativo não é definida.");
            } else {
                double raizQuadrada = Math.sqrt(numero);// calcula a raiz quadrada do número
                System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
            }
               
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
