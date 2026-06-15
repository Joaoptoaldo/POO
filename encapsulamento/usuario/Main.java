package usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o nome do usuário: ");
        String nome = leitor.nextLine();

        System.out.print("Digite a senha do usuário: ");
        String senha = leitor.nextLine();

        Usuario usuario = new Usuario(nome, senha);

        System.out.println("\nNome do usuário: " + usuario.getNome());
        System.out.println("Senha do usuário: " + usuario.getSenha());
    
        leitor.close();
    }
}
