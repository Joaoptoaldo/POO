# Tratamento de Exceções

O tratamento de exceções é um mecanismo que permite lidar com erros e situações inesperadas de forma controlada, evitando que o programa seja interrompido abruptamente. Em Java, as exceções são objetos que representam condições anormais que ocorrem durante a execução do programa.

## Exemplo de Tratamento de Exceções

```java
public class Main {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b; // Isso lançará uma ArithmeticException se b for zero
    }
}
```

## Vantagens do Tratamento de Exceções
1. **Robustez**: Permite que o programa continue executando mesmo quando ocorrem erros, melhorando a robustez do software.
2. **Clareza**: O código de tratamento de exceções torna claro onde os erros podem ocorrer e como eles são tratados, melhorando a legibilidade do código.
3. **Manutenção**: Facilita a manutenção do código, pois os erros são tratados de forma centralizada, permitindo que as correções sejam feitas em um único lugar.
4. **Separação de Preocupações**: Permite separar a lógica de negócios do código de tratamento de erros, tornando o código mais organizado e fácil de entender.
5. **Personalização**: Permite criar exceções personalizadas para lidar com situações específicas do domínio do problema, tornando o tratamento de erros mais relevante e eficaz.


