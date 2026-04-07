package produto;

public class ProdutoEletronico extends Produto {
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public int getGarantia() {
        return garantia;
    }
}
