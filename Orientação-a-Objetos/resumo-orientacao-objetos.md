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

```java
// Classe representando uma conta bancária
public class ContaBancaria {
    // Atributos privados (encapsulamento)
    private double saldo;
    private double limite;
    private double valor;

    // Construtor para inicializar saldo e limite
    public ContaBancaria(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }
    
    // Getters e Setters 
    public double getSaldo(){
        return saldo;
    }

    public double getLimite(){
        return limite;
    }

    // Setter para o limite, com validação para evitar valores negativos
    public void setLimite(double limite){ {
        if (limite >= 0) {
            this.limite = limite; 
        } 
        else {
            System.out.println("[ERRO] O limite não pode ser negativo. Operação cancelada.");
        }
    }
}
    // Método para realizar um saque, considerando o saldo e o limite
    public void Sacar(double valor) { 
        // validação para garantir que o valor do saque seja positivo
        if (valor <= 0) {
            System.out.println("[ERRO] O valor do saque deve ser maior que zero! Operação cancelada.");
            return; 
        }
        // Calcula quanto o cliente tem no total
        double disponivelTotal = this.saldo + this.limite;

        // Verifica se o saque é possível
        if (valor <= disponivelTotal) {
            // Se sim, subtraímos do saldo (o saldo pode ficar negativo até o limite)
            this.saldo -= valor; 
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } 
        else {
            // Se não, avisamos o erro (regra de negócio violada)
            System.out.println("[ERRO] Saldo e limite insuficientes para o saque de R$ " + valor);
        }
    }
}
```

## Vantagens da OO
- **Reutilização** de código (herança)
- **Manutenibilidade** (encapsulamento)
- **Escalabilidade** (polimorfismo)
- **Modelagem natural** do mundo real
- **Facilidade de entendimento** (abstração)