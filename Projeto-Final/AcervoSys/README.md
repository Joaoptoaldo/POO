# AcervoSys

Este projeto é um sistema simples em Java que simula o controle de um acervo de biblioteca, permitindo cadastrar livros e revistas, gerenciar a disponibilidade de empréstimos e calcular prazos de devolução.

## Tecnologias e Conceitos Aplicados

O projeto está dividido nos seguintes pacotes dentro de `src/`:

- **`models`**:
  - `ItemAcervo`: Classe abstrata que serve de base para os itens. Define atributos comuns e o método abstrato de cálculo do prazo.
  - `Livro` e `Revista`: Subclasses que especializam o `ItemAcervo` e implementam as regras específicas de devolução e validação.
- **`interfaces`**:
  - [`IEmprestavel.java`](src/interfaces/IEmprestavel.java): Interface que define o contrato com as ações de `emprestar()` e `devolver()`.
- **`exceptions`**:
  - [`ItemIndisponivelException.java`](src/exceptions/ItemIndisponivelException.java): Exceção personalizada (checked) lançada quando se tenta emprestar um item que já está sob empréstimo.
- **`Main.java`**:
  - Além disso, o grupo deve criar e lançar ao menos uma exceção customizada (`ItemIndisponivelException`) para proteger as regras de negócio.
  - O cadastro de livro está protegido por um loop `while` que garante a entrada válida antes de prosseguir.

---

## Mapeamento dos Requisitos de POO

Aqui está o mapeamento de onde cada um dos 7 requisito obrigatórios foi aplicado:

1. **Classes, Objetos e Atributos:**
   - As entidades estão em `src/models/` ([ItemAcervo.java](src/models/ItemAcervo.java), [Livro.java](src/models/Livro.java) e [Revista.java](src/models/Revista.java)).
   - A criação e manipulação dos objetos ocorrem no fluxo do terminal em [Main.java](src/Main.java).

2. **Construtores:**
   - Implementação de construtor padrão (no-args) e parametrizados em [ItemAcervo.java](src/models/ItemAcervo.java#L11), [Livro.java](src/models/Livro.java#L13) e [Revista.java](src/models/Revista.java#L11).
   - Sobrecarga de construtores em [Livro.java](src/models/Livro.java#L13-L32) para permitir diferentes formas de inicialização.

3. **Encapsulamento e Modificadores de Acesso:**
   - Atributos das classes de modelo definidos como `private`.
   - Modificador `protected` no método `setDisponivel()` em [ItemAcervo.java](src/models/ItemAcervo.java#L48), visível apenas pelas subclasses.
   - Métodos setters contendo validações (ex: ano de publicação em [Livro.java](src/models/Livro.java#L38-L44) e número da edição em [Revista.java](src/models/Revista.java#L36-L41)).

4. **Herança:**
   - Hierarquia com relacionamento "é um" onde [Livro.java](src/models/Livro.java#L7) e [Revista.java](src/models/Revista.java#L5) estendem a classe abstrata `ItemAcervo`.

5. **Polimorfismo:**
   - Sobrescrita de métodos (`@Override`):
     - `calcularPrazoDevolucao()` reescrito em [Livro.java](src/models/Livro.java#L46-L49) (14 dias) e [Revista.java](src/models/Revista.java#L43-L46) (7 dias).
     - `emprestar()` reescrito nas subclasses para mensagens customizadas.
   - Polimorfismo de Inclusão: Armazenamento e processamento uniforme de subclasses na lista polimórfica `List<ItemAcervo> acervo` em [Main.java](src/Main.java#L13) e laço de iteração (linhas 57-73).

6. **Classes Abstratas e Interfaces:**
   - Classe abstrata `ItemAcervo` com o método abstrato `calcularPrazoDevolucao()`.
   - Interface [IEmprestavel.java](src/interfaces/IEmprestavel.java) definindo a assinatura de métodos que padronizam o empréstimo de itens.

7. **Tratamento de Exceções:**
   - Tratamento de erro de conversão com blocos `try-catch` em [Main.java](src/Main.java) para capturar `NumberFormatException` (linhas 26, 45, 89).
   - Exceção customizada [ItemIndisponivelException.java](src/exceptions/ItemIndisponivelException.java) para alertar tentativas de empréstimos duplicados.
   - Try-Catch-Finally: a estrutura de simulação e tratamentos em [Main.java](src/Main.java) (linhas 60-70 e 76-98).

---

## Como Rodar o Projeto

1. Compile o projeto a partir da raiz:
   ```bash
   javac src/interfaces/*.java src/models/*.java src/exceptions/*.java src/Main.java -d bin
   ```
2. Execute a classe Main:
   ```bash
   java -cp bin Main
   ```

---
*Este projeto foi desenvolvido como parte do trabalho final de Programação Orientada a Objetos.*