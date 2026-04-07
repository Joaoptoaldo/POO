package produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camiseta", 29.99);
        ProdutoEletronico p2 = new ProdutoEletronico("Smartphone", 1800.99, 24);

        System.out.println("Produto: " + p1.getNome() + " - Preço: R$" + p1.getPreco());
        System.out.println("Produto: " + p2.getNome() + " - Preço: R$" + p2.getPreco() + " - Garantia: " + p2.getGarantia() + " meses");
    }
}
