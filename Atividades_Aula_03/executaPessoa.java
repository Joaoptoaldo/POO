package Atividades_Aula_03;

import java.util.Scanner;

public class executaPessoa {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa();
		System.out.print("Informe o nome: ");
        pessoa.nome = leitor.nextLine();
        System.out.print("Informe a idade: ");
        pessoa.idade = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Informe o genero: ");
        pessoa.genero = leitor.nextLine();
        
        System.out.println("O nome é: "+pessoa.nome+"\nIdade: "+pessoa.idade+"\nGenero: "+pessoa.genero);
        
	}
}
