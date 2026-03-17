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
  
        // Exibir Carro 1
        System.out.println("Carro 1:");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano de fabricação: " + c1.anoFabrica);
        System.out.println();

        // Exibir Carro 2
        System.out.println("Carro 2:");
        System.out.println("Marca: " + c2.marca);
        System.out.println("Modelo: " + c2.modelo);
        System.out.println("Ano de fabricação: " + c2.anoFabrica);
        System.out.println();
    }

}
