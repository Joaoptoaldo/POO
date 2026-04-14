package sistemaEstoque;

// 9. Sistema de Estoque da Marcenaria (Exceção Unchecked Customizada)

//  Crie uma exceção chamada MadeiraInsuficienteException herdando de RuntimeException. Crie a classe Estoque com quantidadeMdf e quantidadeMacaudiba. Crie o método cortarPeca(String tipo, double metros). Se a metragem solicitada for maior que o estoque, dispare a exceção. Como ela é Unchecked, mostre que o método não precisa declará-la com throws, mas ela interrompe a execução caso a regra seja ferida.  
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(10.0, 5.0);
        try {
            estoque.cortarPeca("MDF", 12.0);
        } catch (MadeiraInsuficienteException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        try {
            estoque.cortarPeca("pinos", 3.0);
        } catch (MadeiraInsuficienteException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
