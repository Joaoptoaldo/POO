# Encapsulamento 

O encapsulamento é um dos pilares da programação orientada a objetos, que consiste em ocultar os detalhes internos de uma classe e expor apenas o necessário para o uso externo. Isso é feito através do uso de modificadores de acesso, como `private`, `protected` e `public`, que controlam a visibilidade dos membros da classe.

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
        
        // Definindo o nome usando o método setter
        pessoa.setNome("João");
        
        // Acessando o nome usando o método getter
        System.out.println(pessoa.getNome()); // Saída: João
    }
}
```
## Vantagens do Encapsulamento

1. **Proteção dos Dados**: O encapsulamento protege os dados de acesso não autorizado, garantindo que apenas métodos autorizados possam acessar ou modificar os atributos da classe.
2. **Facilidade de Manutenção**: Ao ocultar os detalhes internos, o encapsulamento permite que as mudanças sejam feitas na implementação interna sem afetar o código externo que utiliza a classe.
3. **Reutilização de Código**: O encapsulamento facilita a reutilização de código, pois as classes podem ser usadas sem a necessidade de conhecer os detalhes internos.
4. **Melhoria da Legibilidade**: O encapsulamento ajuda a melhorar a legibilidade do código, pois os usuários da classe não precisam se preocupar com os detalhes internos, focando apenas na interface pública.
5. **Facilita a Depuração**: O encapsulamento torna mais fácil a depuração, pois os erros podem ser isolados dentro da classe, sem afetar o código externo.
6. **Promove a Modularidade**: O encapsulamento promove a modularidade, permitindo que as classes sejam desenvolvidas e testadas de forma independente, facilitando a construção de sistemas complexos.
7. **Segurança**: O encapsulamento aumenta a segurança do código, pois impede que partes não autorizadas do programa acessem ou modifiquem os dados sensíveis.
