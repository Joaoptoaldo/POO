package animal;

public class Gato extends Animal {
    @Override
    void emitirSom(String mamifero){
        System.out.println("Miau! O " + mamifero + " está miando.");
    }
}
