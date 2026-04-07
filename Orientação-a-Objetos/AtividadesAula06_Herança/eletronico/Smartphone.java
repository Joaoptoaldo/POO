package eletronico;

// Crie uma subclasse Smartphone que possui o método ligar() e um método adicional conectar4G() .

public class Smartphone extends Eletronico {
    
    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Celular conectado à rede");
    }

    public void conectar4G() {
        System.out.println("Conectando à rede 4G...");
    }

    public Smartphone() {
        super();
    }
}
