import java.util.Scanner;

public class executaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Livro livro1 = new Livro();
        
        System.out.println("Digite o título do livro:");
        livro1.titulo = leitor.nextLine();
        
        System.out.println("Digite o autor do livro:");
        livro1.autor = leitor.nextLine();
        
        System.out.println("Digite o ano de publicação do livro:");
        livro1.anoPublicacao = Integer.parseInt(leitor.nextLine());
        
        System.out.println("\nInformações do Livro:");
        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
        
        leitor.close();
    }
}
