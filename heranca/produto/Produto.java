package produto;

// 5. Crie uma classe Produto com nome e preco.
// Crie ProdutoEletronico que herda e adiciona garantia.

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getGarantia() {
        return 0; // Produto comum não tem garantia
    }
}
