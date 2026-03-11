package primeiroOO;

import java.util.Scanner;

public class executaPC {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // pc 1
        Computador pc1 = new Computador();
        System.out.print("Digite a marca do pc: ");
        pc1.marca = leitor.nextLine();
        System.out.print("Digite o modelo: ");
        pc1.modelo = leitor.nextLine();
        System.out.print("Digite o preço: ");
        pc1.preco = leitor.nextDouble();
        leitor.nextDouble(); 
  
       // System.out.println();

        // pc 2
        Computador pc2 = new Computador();
        pc2.marca = "Asus";
        pc2.modelo = "ROG";
        pc2.tipo = "notebook";
        pc2.preco = 3.200;
        

        System.out.println("Marca: "+pc2.marca);
        System.out.println("Modelo: "+pc2.modelo);
        System.out.println("Tipo: "+pc2.tipo);
        System.out.println("Preço: "+pc2.preco);
 
        System.out.println();
    }
}
