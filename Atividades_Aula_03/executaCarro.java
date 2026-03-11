package Atividades_Aula_03;

import java.util.Scanner;

public class executaCarro {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // carro 1
        Carro c1 = new Carro();
        System.out.println("Cadastro Carro");
        
        System.out.print("Digite a marca: ");
        c1.marca = leitor.nextLine();
        System.out.print("Digite o modelo: ");
        c1.modelo = leitor.nextLine();
        System.out.print("Digite o ano de fabricação: ");
        c1.anoFabrica = leitor.nextInt();
        leitor.nextLine(); 
        System.out.println();

        // carro 2 
        Carro c2 = new Carro();
        System.out.println("Cadastro Carro");
        
        System.out.print("Digite a marca: ");
        c2.marca = leitor.nextLine();
        System.out.print("Digite o modelo: ");
        c2.modelo = leitor.nextLine();
        System.out.print("Digite o ano de fabricação: ");
        c2.anoFabrica = leitor.nextInt();
        leitor.nextLine(); 
  
        System.out.println();
    }

}
