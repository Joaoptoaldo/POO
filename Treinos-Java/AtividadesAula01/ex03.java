package AtividadesAula01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        float n1, n2, n3, n4, media;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de n1: ");
        n1 = leitor.nextFloat();

        System.out.println("Digite o valor de n2: ");
        n2 = leitor.nextFloat();

        System.out.println("Digite o valor de n3: ");
        n3 = leitor.nextFloat();

        System.out.println("Digite o valor de n4: ");
        n4 = leitor.nextFloat();



        media = (n1 + n2 + n3 + n4) / 4;

        if(n1 > media){
            System.out.println("O número " + n1 + " é maior que a média.");
        }
        if(n2 > media){
            System.out.println("O número " + n2 + " é maior que a média.");
        }
        if(n3 > media){
            System.out.println("O número " + n3 + " é maior que a média.");
        }
        if(n4 > media){
            System.out.println("O número " + n4 + " é maior que a média.");
        }

        System.out.println("A média é: " + media);
        System.out.println("Números maiores que a média: ");
        

        leitor.close();
    }
}
