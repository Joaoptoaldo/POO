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
                    case 0: 
                        System.out.println("Encerrando..."); 
                        break;
                    default: 
                        System.out.println("Opção inválida");
                }
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida");
            }
        }

        leitor.close();
    }

   // métodos auxiliares

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
            System.out.println(i + ": " + acervo.get(i).getTitulo());
        }
    }

    /**
     * método que cadastra um livro
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void cadastrarLivro(List<ItemAcervo> acervo, Scanner leitor) {
        System.out.print("Título: ");
        String titulo = leitor.nextLine();
        System.out.print("Autor: ");
        String autor = leitor.nextLine();
        System.out.print("Ano: ");
        int ano = Integer.parseInt(leitor.nextLine());
        acervo.add(new Livro(titulo, autor, ano));
        System.out.println("Cadastrado!");
    }

    /**
     * método que cadastra uma revista
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void cadastrarRevista(List<ItemAcervo> acervo, Scanner leitor) {
        System.out.print("Título: ");
        String titulo = leitor.nextLine();
        System.out.print("Autor: ");
        String autor = leitor.nextLine();
        System.out.print("Edição: ");
        int edicao = Integer.parseInt(leitor.nextLine());
        acervo.add(new Revista(titulo, autor, edicao));
        System.out.println("Cadastrado!");
    }

    /**
     * método que remove um item do acervo
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void removerItem(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        System.out.print("ID para remover: ");
        int id = Integer.parseInt(leitor.nextLine());
        if (id >= 0 && id < acervo.size() && acervo.get(id).isDisponivel()) {
            acervo.remove(id);
            System.out.println("Removido");
        } else {
            System.out.println("Erro: Item não encontrado ou emprestado");
        }
    }

    /**
     * método que simula um empréstimo
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void simularEmprestimo(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        System.out.print("ID para emprestar: ");
        int id = Integer.parseInt(leitor.nextLine());
        try {
            acervo.get(id).emprestar();
            System.out.println("Emprestado");
        } catch (ItemIndisponivelException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * método que simula a devolução de um item
     * @param acervo lista de itens do acervo
     * @param leitor scanner para leitura dos dados
     */
    private static void simularDevolucao(List<ItemAcervo> acervo, Scanner leitor) {
        listarAcervo(acervo);
        System.out.print("ID para devolver: ");
        int id = Integer.parseInt(leitor.nextLine());
        acervo.get(id).devolver();
        System.out.println("Devolvido");
    }
}