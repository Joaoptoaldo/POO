package AtividadesAula01;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a idade: ");
        idade = scanner.nextInt();

        if(idade < 16){
            System.out.println("Não eleitor");
        }
        else if(idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Eleitor facultativo");
        }
        else{
            System.out.println("Eleitor obrigatório");
        }
        scanner.close();
    }
}
