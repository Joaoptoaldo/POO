package produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade inicial em estoque: ");
        int quantidadeInicial = leitor.nextInt();
        Produto produto = new Produto(quantidadeInicial);

        System.out.print("Digite a quantidade a adicionar ao estoque: ");
        int quantidadeAdicionar = leitor.nextInt();
        produto.adicionarEstoque(quantidadeAdicionar);

        System.out.print("Digite a quantidade a remover do estoque: ");
        int quantidadeRemover = leitor.nextInt();
        produto.removerEstoque(quantidadeRemover);

        leitor.close();
    }
}