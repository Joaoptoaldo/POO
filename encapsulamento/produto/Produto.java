//4 - Na classe Produto , o atributo quantidadeEmEstoque deve ser privado. 
// Crie métodos adicionarEstoque(int qtd) e removerEstoque(int qtd) . 
// O método de remoção não pode deixar o estoque ficar negativo.

package produto;

public class Produto {
    private int quantidadeEmEstoque;

    public Produto(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int qtd) {
        this.quantidadeEmEstoque += qtd;
    }

    public void removerEstoque(int qtd) {
        if (qtd <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= qtd;
        } 
        else {
            System.out.println("[ERRO] Não é possível remover " + qtd + " unidades. Estoque insuficiente.");
        }
    }
}
