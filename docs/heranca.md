# Herança

A herança é um dos pilares da programação orientada a objetos (POO) e permite que uma nova classe (chamada de classe filha ou subclasse) herde atributos e métodos de uma classe existente (chamada de classe pai ou superclasse). Isso promove a reutilização de código e facilita a manutenção do software.

## Exemplo de Herança

```Java
// Classe pai (superclasse)
class Animal {
    void comer() {
        System.out.println("O animal está comendo.");
    }
}

// Classe filha (subclasse) que herda da classe Animal
class Cachorro extends Animal {
    void latir() {
        System.out.println("O cachorro está latindo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        
        // O cachorro pode usar o método comer() da classe Animal
        meuCachorro.comer(); // Saída: O animal está comendo.
        
        // O cachorro também pode usar seu próprio método latir()
        meuCachorro.latir(); // Saída: O cachorro está latindo.
    }
}
```

## Vantagens da Herança

1. **Reutilização de Código**: Permite que as subclasses reutilizem o código da superclasse, evitando a duplicação de código.
2. **Facilidade de Manutenção**: Alterações na superclasse são automaticamente refletidas em todas as subclasses, facilitando a manutenção do código.
3. **Polimorfismo**: Permite que objetos de diferentes classes sejam tratados como objetos da mesma classe pai, facilitando a implementação de métodos genéricos.
4. **Organização**: Ajuda a organizar o código em uma hierarquia lógica, tornando-o mais fácil de entender e navegar.
