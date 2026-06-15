package itemmenu;

public class ItemMenu {
    protected String nome;
    protected double preco;

    public ItemMenu(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "ItemMenu{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
