// 2 - Crie uma classe chamada Computador que possua 4 atributos: marca, modelo, tipo (notebook, netbook, tablet, etc) e preço.
//Essa classe Computador também deverá ser executável, entretanto crie uma outra classe executável que irá instanciar a classe 
//Computador, criando 2 objetos. O primeiro objeto deverá ser criado através da solicitação dos valores ao usuário por linha de 
//execução. Já, os valores do segundo objeto, deverão ser definidos no código-fonte da classe que o criou. Exiba na tela os resultados.
import java.util.Scanner;

public class executaPC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Computador pc1 = new Computador();
        
        System.out.println("Digite a marca do computador:");
        pc1.marca = leitor.nextLine();
        
        System.out.println("Digite o modelo do computador:");
        pc1.modelo = leitor.nextLine();
        
        System.out.println("Digite o tipo do computador (notebook, netbook, tablet, etc):");
        pc1.tipo = leitor.nextLine();
        
        System.out.println("Digite o preço do computador:");
        pc1.preco = leitor.nextDouble();
        
        Computador pc2 = new Computador();
        pc2.marca = "Dell";
        pc2.modelo = "XPS 13";
        pc2.tipo = "notebook";
        pc2.preco = 999.99;
        
        System.out.println("\nComputador 1:");
        System.out.println("Marca: " + pc1.marca);
        System.out.println("Modelo: " + pc1.modelo);
        System.out.println("Tipo: " + pc1.tipo);
        System.out.println("Preço: $" + pc1.preco);
        
        System.out.println("\nComputador 2:");
        System.out.println("Marca: " + pc2.marca);
        System.out.println("Modelo: " + pc2.modelo);
        System.out.println("Tipo: " + pc2.tipo);
        System.out.println("Preço: " + pc2.preco);
        
        leitor.close();
    }
}
