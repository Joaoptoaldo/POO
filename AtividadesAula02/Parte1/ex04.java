package pkg;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double n, somatorio = 0, media;
        int contador = 0;
        
        while(true) {
            System.out.println("Digite um valor (ou 0 para sair): ");
            n = teclado.nextDouble();
            
            if(n == 0) {
                break;
            }

            somatorio += n; // mesmo que somatorio = somatorio + n
            contador++;
        }
        
        // para não dividir por zero
        if (contador > 0) {
            media = somatorio / contador;
            System.out.println("A média dos " + contador + " números é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido para calcular a média.");
        }

        teclado.close();
    }
}