package escalaMusical;

// 2. Escala Musical (ArrayIndexOutOfBoundsException)
// Crie um programa que inicialize um vetor de Strings com as notas de uma escala musical: {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"}. Peça ao usuário para digitar um número de 1 a 7 para exibir a nota correspondente. Lembre-se que os índices do vetor vão de 0 a 6. Use try-catch para evitar que o programa quebre se o usuário digitar 8 ou 0.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] notas = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = leitor.nextInt();
        try {
            System.out.println("Nota: " + notas[numero - 1]);
        } catch (ArrayIndexOutOfBoundsException erro) {
            System.out.println("Número inválido! Digite um número entre 1 e 7!");
        }
        leitor.close();
    }
}
