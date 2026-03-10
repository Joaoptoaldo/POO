package Atividades_Aula_02.Parte2;

import java.util.Scanner;

public class ex03 {
    //3 - Escreva um programa Java que use um vetor
    //  para ler as notas de 5 alunos e depois calcule e imprima a média das notas.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as notas dos 5 alunos: ");
        double[] notas = new double[5];
        double somatorio = 0, media;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            somatorio += notas[i];
        }

        media = somatorio / notas.length;

        System.out.println("A média das notas é: " + media);
    }
}
