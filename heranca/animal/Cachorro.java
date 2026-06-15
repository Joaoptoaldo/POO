package animal;

// Classe filha (subclasse) que herda da classe Animal
class Cachorro extends Animal {
    public String raca = "Vira-lata";

    @Override
    void emitirSom(String mamifero) {
        super.emitirSom(mamifero);
        System.out.println("Au au! O " + mamifero + " da raça " + raca + " está latindo.");
    }
}
