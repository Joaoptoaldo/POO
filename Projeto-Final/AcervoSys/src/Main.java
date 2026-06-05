import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.ItemIndisponivelException;
import models.ItemAcervo;
import models.Livro;
import models.Revista;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<ItemAcervo> acervo = new ArrayList<>();

        System.out.println("--- Cadastro de Livro ---");
        boolean livroCadastrado = false;
        while (!livroCadastrado) {
            try {
                System.out.print("Título do livro: ");
                String tituloLivro = leitor.nextLine();
                System.out.print("Autor do livro: ");
                String autorLivro = leitor.nextLine();
                System.out.print("Ano de publicação: ");
                int anoLivro = Integer.parseInt(leitor.nextLine());

                acervo.add(new Livro(tituloLivro, autorLivro, anoLivro));
                System.out.println("Livro cadastrado com sucesso!");
                livroCadastrado = true; 
                System.out.println("\n");

            } catch (NumberFormatException e) {
                System.err.println("Erro: O ano de publicação deve ser um número inteiro");
            } catch (IllegalArgumentException e) {
                System.err.println("Erro de validação: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Erro inesperado: " + e.getMessage());
            }
        }

        System.out.println("\n--- Cadastro de Revista ---");
        try {
            System.out.print("Título da revista: ");
            String tituloRevista = leitor.nextLine();
            System.out.print("Autor/Editora: ");
            String autorRevista = leitor.nextLine();
            System.out.print("Edição: ");
            int edicaoRevista = Integer.parseInt(leitor.nextLine());

            acervo.add(new Revista(tituloRevista, autorRevista, edicaoRevista));
            System.out.println("Revista cadastrada com sucesso!");
            System.out.println("\n");   

        } catch (NumberFormatException e) {
            System.err.println("Erro: A edição deve ser um número inteiro");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

        
        System.out.println("--- Simulação de Empréstimos ---");
        for (ItemAcervo item : acervo) {
            System.out.println("Item: " + item.getTitulo() + " - Prazo para devolução: " + item.calcularPrazoDevolucao() + " dias");

            try {
                item.emprestar();
                System.out.println("Status: Emprestado");
                item.emprestar(); 
            } catch (ItemIndisponivelException e) {
                System.err.println("Regra de negócio: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Concluído para: " + item.getTitulo());
            }
            
            System.out.println("--------------------------------");
        }

        System.out.println("\n--- Teste de Entrada e Validação (requisito 7) ---");

        try {
            System.out.print("Digite o ano de lançamento para um novo livro teste: ");
            String entrada = leitor.nextLine();
            int ano = Integer.parseInt(entrada); 

            Livro novoLivro = new Livro("livro teste", "autor teste", ano);
            System.out.println("Livro '" + novoLivro.getTitulo() + "' instanciado");

            // validação de regra de negócio (Encapsulamento + IllegalArgumentException)
            System.out.print("Tente alterar o ano para um valor futuro (ex: 2099): ");
            int novoAno = Integer.parseInt(leitor.nextLine());
            novoLivro.setAnoPublicacao(novoAno);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Digite um ano válido");
        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Fim dos testes.");
            leitor.close();
        }
    }
    
}
