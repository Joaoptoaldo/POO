package Atividades_Aula_01;

public class ex05 {
    public static void main(String[] args) {
        int n1, n2, n3;

        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(System.console().readLine());

        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(System.console().readLine());

        System.out.println("Digite o terceiro número: ");
        n3 = Integer.parseInt(System.console().readLine());

        if(n1 > n2 && n1 > n3){
            System.out.println("O número " + n1 + " é o maior.");
        } else if(n2 > n1 && n2 > n3){
            System.out.println("O número " + n2 + " é o maior.");
        } else if(n3 > n1 && n3 > n2){
            System.out.println("O número " + n3 + " é o maior.");
        } else { 
            System.out.println("Os números são iguais.");
        }

        //ex06: em ordem crescente
        int aux; // variável auxiliar para troca de valores

        if (n1 > n2) {
            aux = n1; 
            n1 = n2; 
            n2 = aux;
        }
        if (n1 > n3) {
            aux = n1; 
            n1 = n3; 
            n3 = aux;
        }
        if (n2 > n3) {
            aux = n2; 
            n2 = n3; 
            n3 = aux;
        }

        System.out.println("Ordem crescente: " + n1 + ", " + n2 + ", " + n3);

        }
}
