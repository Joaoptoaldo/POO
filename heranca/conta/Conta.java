package conta;

//8) Crie uma classe Conta com um método render() . Crie uma subclasse
//ContaPoupanca que sobrescreve render() para aumentar o saldo em 1%.

public class Conta {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

}
