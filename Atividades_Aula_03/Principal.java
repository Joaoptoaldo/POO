package primeiroOO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // FILME 1
        Filme f1 = new Filme();
        System.out.println("Cadastro do Filme");
        
        System.out.print("Digite o título do Filme 1: ");
        f1.titulo = scanner.nextLine();
        f1.titulo = "";
        System.out.print("Digite o diretor do Filme 1: "+f1.diretor);
        f1.diretor = scanner.nextLine();
        System.out.print("Digite o ano de lançamento do Filme 1: ");
        f1.anoLancamento = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o gênero do Filme 1: ");
        f1.genero = scanner.nextLine();
        f1.genero = "";
        System.out.println();

        // FILME 2 
        Filme f2 = new Filme();
        System.out.println("Cadastro do Filme 2");
        
        System.out.print("Digite o título do Filme 2: ");
        f2.titulo = scanner.nextLine();
        
        System.out.print("Digite o diretor do Filme 2: ");
        f2.diretor = scanner.nextLine();
        System.out.print("Digite o ano de lançamento do Filme 2: ");
        f2.anoLancamento = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Digite o gênero do Filme 2: ");
        f2.genero = scanner.nextLine();
        System.out.println();

        scanner.close();
    }

}
