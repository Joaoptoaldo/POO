public class ContaCorrente {
    public String titular;
    public double saldo;

    public void SaldoInicial(double Saldo){
        this.saldo = Saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito deve ser positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + String.format("%.2f", valor) + " realizado com sucesso!");
        } else if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para sacar R$ " + String.format("%.2f", valor));
        } else {
            System.out.println("Valor de saque deve ser positivo!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + this.titular + ": R$ " + String.format("%.2f", this.saldo));
    }
}
