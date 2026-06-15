package geometria02;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. Criamos um triângulo padrão (válido) para começar
        Triangulo triangulo = new Triangulo(5.0, 5.0, 5.0);

        System.out.println("Triângulo criado com lados: 5, 5, 5");
        System.out.print("Digite o novo valor para o lado A: ");
        double novoA = leitor.nextDouble();
        
        // 2. O Triangulo vai validar se 'novoA' funciona com os lados B=5 e C=5
        triangulo.setLadoA(novoA);

        // 3. Mostramos o resultado final para provar se mudou ou não
        System.out.println("Valor final do Lado A: " + triangulo.getLadoA());

        leitor.close();
    }
}
