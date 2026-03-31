// 1 - Crie uma classe ContaBancaria com os atributos privados saldo e limite . 
// Implemente um setter para o limite que não permita valores negativos. O método sacar(double valor) 
// deve permitir o saque apenas se o valor for menor ou igual à soma do saldo + limite.

package contaBancaria;

public class ContaBancaria {
    private double saldo;
    private double limite;
    private double valor;

    public ContaBancaria(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){ {
        if (limite >= 0) {
            this.limite = limite; 
        } 
        else {
            System.out.println("[ERRO] O limite não pode ser negativo. Operação cancelada.");
        }
    }
}

    public void Sacar(double valor) { 
        if (valor <= 0) {
            System.out.println("[ERRO] O valor do saque deve ser maior que zero! Operação cancelada.");
            return; 
        }
    
        double disponivelTotal = this.saldo + this.limite;

        if (valor <= disponivelTotal) {
            this.saldo -= valor; 
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } 
        else {
            System.out.println("[ERRO] Saldo e limite insuficientes para o saque de R$ " + valor);
        }
    }
}
