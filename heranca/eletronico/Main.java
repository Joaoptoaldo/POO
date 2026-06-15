package eletronico;

public class Main {
    public static void main(String[] args) {
        Eletronico equip = new Eletronico();
        equip.ligar();

        Smartphone celular = new Smartphone();
        celular.ligar();
        celular.conectar4G();   
    }
}
