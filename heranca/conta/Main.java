package conta;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000.0);
        System.out.println("Saldo antes de render: " + contaPoupanca.saldo);
        contaPoupanca.render();
        System.out.println("Saldo após render: " + contaPoupanca.saldo);
    }
}
