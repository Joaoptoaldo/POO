import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.ItemIndisponivelException;
import models.ItemAcervo;
import models.Livro;
import models.Revista;

public class Main {
    public static void main(String[] args) {
        List<ItemAcervo> acervo = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);

        // populando o acervo inicial
        acervo.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
        acervo.add(new Revista("National Geographic", "Vários", 2020));

        int opcao = -1;
        
        while (opcao != 0) {
            System.out.println("\n---- ACERVOSYS ----");
            System.out.println("1 - Listar acervo");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Cadastrar revista");
            System.out.println("4 - Remover");
            System.out.println("5 - Empréstimo");
            System.out.println("6 - Devolução");
            System.out.println("7 - Consultar prazo de devolução");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(leitor.nextLine());
            
                switch (opcao) {
                    case 1: 
                        listarAcervo(acervo); 
                        break;
                    case 2: 
                        cadastrarLivro(acervo, leitor); 
                        break;
                    case 3: 
                        cadastrarRevista(acervo, leitor); 
                        break;
                    case 4: 
                        removerItem(acervo, leitor); 
                        break;
                    case 5: 
                        simularEmprestimo(acervo, leitor); 
                        break;
                    case 6: 
                        simularDevolucao(acervo, leitor); 
                        break;
                    case 7: 
                        consultarPrazoDevolucao(acervo, leitor); 
                        break;
                    case 0: 
                        System.out.println("Encerrando..."); 
                        break;
                    default: 
                        System.out.println("Opção inválida");
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido");
            }
        }

        leitor.close();
    }

    // métodos auxiliares

    /**
     * método que valida se um campo de texto está vazio ou contém apenas espaços
     * @param valor conteúdo do campo
     * @param nomeCampo nome do campo para exibição no erro
     * @throws IllegalArgumentException se o campo estiver vazio
     */
    private static void validarCampo(String valor, String nomeCampo) {
        if (valor == null || valor.trim().isEmpty()) { // remove espaços em branco do início e do fim do texto e verifica se está vazio
            throw new IllegalArgumentException("O campo '" + nomeCampo + "' não pode estar vazio!");
        }
    }

    /**
     * método que lista o acervo
     * @param acervo lista de itens do acervo
     */
    private static void listarAcervo(List<ItemAcervo> acervo) {
        System.out.println("\nLista de itens do acervo:");
        if (acervo.isEmpty()) {
            System.out.println("Acervo vazio");
            return;
        }
        for (int i = 0; i < acervo.size(); i++) {
            System.out.println(i + ": " + acervo.get(i).getTitulo()+ " - " + acervo.get(i).getAutor() + (acervo.get(i).isDisponivel() ? " (Disponível)" : " (Indisponível)"));
        }
    }

    /**
     * método que cadastra um livro
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void cadastrarLivro(List<ItemAcervo> acervo, Scanner leitor) {
        try {
            System.out.print("Título: ");
            String titulo = leitor.nextLine();
            validarCampo(titulo, "Título");

            System.out.print("Autor: ");
            String autor = leitor.nextLine();
            validarCampo(autor, "Autor");

            System.out.print("Ano: ");
            int ano = Integer.parseInt(leitor.nextLine());

            acervo.add(new Livro(titulo, autor, ano));
            System.out.println("Cadastrado!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * método que cadastra uma revista
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void cadastrarRevista(List<ItemAcervo> acervo, Scanner leitor) {
        try {
            System.out.print("Título: ");
            String titulo = leitor.nextLine();
            validarCampo(titulo, "Título");

            System.out.print("Autor: ");
            String autor = leitor.nextLine();
            validarCampo(autor, "Autor");

            System.out.print("Edição: ");
            int edicao = Integer.parseInt(leitor.nextLine());

            acervo.add(new Revista(titulo, autor, edicao));
            System.out.println("Cadastrado!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /**
     * método que remove um item do acervo
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void removerItem(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        if (acervo.isEmpty()) return;

        System.out.print("\nID para remover: ");
        try {
            int id = Integer.parseInt(leitor.nextLine());
            if (id >= 0 && id < acervo.size() && acervo.get(id).isDisponivel()) {
                acervo.remove(id);
                System.out.println("Removido");
            } else {
                System.out.println("Erro: Item não encontrado ou está emprestado");
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um número válido para o ID");
        }
    }

    /**
     * método que simula um empréstimo
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void simularEmprestimo(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        if (acervo.isEmpty()) return;
        System.out.print("\nID para emprestar: ");
        try {
            int id = Integer.parseInt(leitor.nextLine());
            acervo.get(id).emprestar();
            System.out.println("Emprestado");

        } catch (ItemIndisponivelException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Erro: ID inválido");
        } finally {
            System.out.println("Operação de empréstimo finalizada");
        }
    }

    /**
     * método que simula a devolução de um item
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void simularDevolucao(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        if (acervo.isEmpty()) return; 
        System.out.print("\nID para devolver: ");
        try {
            int id = Integer.parseInt(leitor.nextLine());
            acervo.get(id).devolver();
            System.out.println("Devolvido");

        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Erro: ID inválido");
        }
    }

    /**
     * método que consulta o prazo de devolução
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void consultarPrazoDevolucao(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        System.out.print("\nID para consultar prazo de devolução: ");
        try {
            int id = Integer.parseInt(leitor.nextLine());
            ItemAcervo item = acervo.get(id);
            System.out.println("Prazo: " + item.calcularPrazoDevolucao() + " dias" + "\nItem: " + item.getTitulo());
        }
        catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("ID inválido");
        }
    }
}
