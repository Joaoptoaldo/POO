package Atividades_Aula_03;

import java.util.Scanner;

public class Biblioteca {
         public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
                
        Livro l = new Livro();
        System.out.print("Digite o titulo do livro: ");
        l.titulo = leitor.nextLine();
        System.out.print("Digite o autor: ");
        l.autor = leitor.nextLine();
        System.out.print("Digite o ano de publicação: ");
        l.anoPubli = leitor.nextInt();
        leitor.nextInt(); 

        System.out.println("O nome é: " + l.titulo);
        System.out.println("Ano de publicação: " + l.anoPubli);
        System.out.println("Autor: " + l.autor);
        }

}
