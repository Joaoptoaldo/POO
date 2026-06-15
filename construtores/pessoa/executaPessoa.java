import java.util.Scanner;

public class executaPessoa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Pessoa pessoa1 = new Pessoa();
        
        System.out.println("Digite o nome da pessoa:");
        pessoa1.nome = leitor.nextLine();
        
        System.out.println("Digite a idade da pessoa:");
        pessoa1.idade = leitor.nextInt();
        leitor.nextLine(); // limpar o buffer
        
        System.out.println("Digite o gênero da pessoa:");
        pessoa1.genero = leitor.nextLine();
        
        System.out.println("\nInformações da Pessoa:");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Gênero: " + pessoa1.genero);
        
        leitor.close();
    }
}