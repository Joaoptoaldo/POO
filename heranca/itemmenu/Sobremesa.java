package itemmenu;

public class Sobremesa extends ItemMenu {
    private boolean contemAcucar;

    public Sobremesa(String nome, double preco, boolean contemAcucar) {
        super(nome, preco);
        this.contemAcucar = contemAcucar;
    }

    public boolean isContemAcucar() {
        return contemAcucar;
    }

    @Override
    public String toString() {
        return "Sobremesa {" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", contemAcucar=" + contemAcucar +
                '}';
    }
}
