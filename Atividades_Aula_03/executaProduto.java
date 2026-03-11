package primeiroOO;

import java.util.Scanner;

public class executaProduto {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
//	•Crie uma classe executável que:
//
//	•Solicite os valores ao usuário pelo teclado.
//
//	•Crie um objeto do tipo Produto.
//
//	•Calcule o valor total em estoque (preço × quantidade).
//
//	•Exiba todas as informações do produto e o valor total em estoque.
        
        Produto novo = new Produto();
        System.out.print("Digite o nome do produto: ");
        novo.nome = leitor.nextLine();
        System.out.print("Digite o preço do produto: ");
        novo.preco = leitor.nextDouble();
        leitor.nextLine(); 
        System.out.print("Digite a quantidade em estoque: ");
        novo.quantidadeEmEstoque = leitor.nextInt();
        leitor.nextInt(); 
	}
}
