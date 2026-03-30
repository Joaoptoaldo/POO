# Resumo: Orientação a Objetos (OO)

Orientação a Objetos (OO) é um paradigma de programação que organiza o software em **objetos**, que são instâncias de **classes**. Cada objeto combina **dados** (atributos) e **comportamentos** (métodos), modelando o mundo real de forma mais intuitiva.

### Princípios Fundamentais (Pilares da OO)

1. **Encapsulamento** 
   - Agrupa dados e métodos em uma classe.
   - Usa modificadores de acesso (`private`, `public`, `protected`) para esconder detalhes internos.
   - Exemplo: Atributos privados acessados via getters/setters.

2. **Herança** 
   - Permite que uma classe (subclasse) herde atributos e métodos de outra (superclasse).
   - Promove reutilização de código.
   - Exemplo: `Carro` herda de `Veículo`.

3. **Polimorfismo** 
   - \"Muitas formas\". Objetos de diferentes classes respondem à mesma mensagem de forma específica.
   - **Sobrecarga** (overload): Mesmo método, parâmetros diferentes.
   - **Sobrescrita** (override): Redefinir método da superclasse.

4. **Abstração** 
   - Mostra apenas o essencial, esconde complexidade.
   - Usada via **classes abstratas** e **interfaces**.

## Conceitos Chave

| Conceito | Descrição | Exemplo Java |
|----------|-----------|--------------|
| **Classe** | Modelo/blueprint do objeto | `class Carro {}` |
| **Objeto** | Instância da classe | `Carro meuCarro = new Carro();` |
| **Atributos** | Variáveis da classe | `private String cor;` |
| **Métodos** | Comportamentos da classe | `public void acelerar()` |
| **Construtor** | Inicializa objeto | `public Carro(String cor)` |
| **this** | Referência ao objeto atual | `this.cor = cor;` |
| **static** | Pertence à classe, não ao objeto | `static int totalCarros;` |


## Exemplo Prático (Java)
### 1. Abstração (Superclasse)
- Definimos o que é essencial para qualquer veículo, mas sem implementar os detalhes de como cada um se move:
```java
// Classe abstrata: Define o conceito, mas não pode ser instanciada diretamente
public abstract class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    // Método abstrato: Obriga as subclasses a implementarem sua própria lógica
    public abstract void mover();

    public String getMarca() {
        return marca;
    }
}
```
### 2. Herança e Encapsulamento (Classe Carro)
- `Carro` herda de `Veiculo` e protege seus atributos internos, expondo apenas o necessário via métodos públicos:
```java
public class Carro extends Veiculo {
    // Encapsulamento: Atributos privados
    private int velocidadeAtual;
    private int capacidadeTanque;

    public Carro(String marca, int capacidadeTanque) {
        super(marca); // Chama o construtor da superclasse
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeAtual = 0;
    }

    // Getter e Setter com validação (Regra de Negócio)
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
            System.out.println("Acelerando... Velocidade: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("[ERRO] O incremento deve ser positivo.");
        }
    }

    // Sobrescrita (Polimorfismo de inclusão)
    @Override
    public void mover() {
        System.out.println("O carro da marca " + getMarca() + " está se deslocando pelas vias urbanas.");
    }
}
```

## Vantagens da OO
- **Reutilização** de código (herança)
- **Manutenibilidade** (encapsulamento)
- **Escalabilidade** (polimorfismo)
- **Modelagem natural** do mundo real
- **Facilidade de entendimento** (abstração)