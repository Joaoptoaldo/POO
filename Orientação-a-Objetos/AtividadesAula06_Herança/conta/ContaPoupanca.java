package conta;

//ContaPoupanca que sobrescreve render() para aumentar o saldo em 1%.

public class ContaPoupanca extends Conta {
    private double saldo;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
    public void render() {
        saldo += saldo * 0.01; // Aumenta o saldo em 1%
    }
}
