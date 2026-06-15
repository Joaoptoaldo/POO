package animal;

//Superclasse pai 
class Animal {
    public String mamifero;

    void emitirSom(String mamifero) {
        this.mamifero = mamifero;
        System.out.println("O animal está emitindo um som.");
    }
}


