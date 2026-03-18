package pkg;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cidade;

        do {
            System.out.print("Digite uma cidade: ");
            cidade = teclado.nextLine();

            if (cidade.equalsIgnoreCase("São Paulo")) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Cidade lida: " + cidade);
            }
            
        } while (!cidade.equalsIgnoreCase("São Paulo"));

        teclado.close();
    }
}