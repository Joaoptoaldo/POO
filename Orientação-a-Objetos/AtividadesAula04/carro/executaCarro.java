//Crie uma classe executável onde o usúario indica o número de objetos do 
//tipo Carro e exibir na tela os valores dos atributos criados
package carro;

import java.util.Scanner;

public class executaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos carros quer cadastrar? ");
        int quantidade;
    
        quantidade = Integer.parseInt(leitor.nextLine());
        

        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero!");
            leitor.close();
            return;
        }

        Carro[] carros = new Carro[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro Carro " + (i + 1));
            carros[i] = new Carro();

            System.out.println("Digite a marca: ");
            carros[i].marca = leitor.nextLine();

            System.out.println("Digite o modelo: ");
            carros[i].modelo = leitor.nextLine();

            System.out.println("Digite o ano de fabricação: ");
            carros[i].anoFabric = Integer.parseInt(leitor.nextLine());
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Carro " + (i + 1) + ":");
            System.out.println("Marca: " + carros[i].marca);
            System.out.println("Modelo: " + carros[i].modelo);
            System.out.println("Ano de Fabricação: " + carros[i].anoFabric);
            System.out.println();
        }

        leitor.close();
    }
}
