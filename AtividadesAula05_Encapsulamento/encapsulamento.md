# Encapsulamento 

O encapsulamento é um dos pilares da programação orientada a objetos (POO) e refere-se à prática de ocultar os detalhes internos de uma classe e expor apenas o que é necessário para o uso externo. Isso ajuda a proteger os dados e a garantir que a classe seja usada de maneira controlada.

## Exemplo de Encapsulamento

```Java
class Pessoa {
    private String nome; // Atributo privado

    // Método público para acessar o nome
    public String getNome() {
        return nome;
    }

    // Método público para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        
        // Usando os métodos públicos para definir e acessar o nome
        pessoa.setNome("João");
        System.out.println(pessoa.getNome()); // Saída: João
    }
}
```

## Vantagens do Encapsulamento
1. **Proteção de Dados**: O encapsulamento protege os dados internos da classe, evitando que sejam acessados ou modificados diretamente por código externo.
2. **Facilidade de Manutenção**: Permite que a implementação interna da classe seja alterada sem afetar o código externo que a utiliza, desde que a interface pública permaneça a mesma.
3. **Reutilização de Código**: Facilita a reutilização de código, pois as classes podem ser usadas como blocos de construção para outras classes.
4. **Melhoria da Legibilidade**: Ajuda a melhorar a legibilidade do código, pois os detalhes internos são ocultados, permitindo que os desenvolvedores se concentrem na funcionalidade principal da classe.
5. **Controle de Acesso**: Permite controlar o acesso aos dados e métodos da classe, garantindo que apenas as operações permitidas sejam realizadas.

