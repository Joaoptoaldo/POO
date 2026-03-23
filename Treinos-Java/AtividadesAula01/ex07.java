package AtividadesAula01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();

        if (n1 == 0 || n2 == 0) {
            System.out.println("Zero não é múltiplo de ninguém (e não se divide por zero).");
        } 
        else if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("São múltiplos!");
        } 
        else {
            System.out.println("Não são múltiplos.");
        }
        scanner.close();
    }
}
