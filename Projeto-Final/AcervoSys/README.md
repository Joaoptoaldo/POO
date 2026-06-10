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
  - Contém o fluxo principal da aplicação, o menu interativo e o gerenciamento das operações do acervo.

---

## Mapeamento dos Requisitos de POO

Aqui está o mapeamento de onde cada um dos 7 requisito obrigatórios foi aplicado:

1. **Classes, Objetos e Atributos:**
   - As entidades estão em `src/models/` ([ItemAcervo.java](src/models/ItemAcervo.java), [Livro.java](src/models/Livro.java) e [Revista.java](src/models/Revista.java)).
   - A criação e manipulação dos objetos ocorrem no fluxo do terminal em [Main.java](src/Main.java).

2. **Construtores:**
   - Implementação de construtor padrão (no-args) e parametrizados em [ItemAcervo.java](src/models/ItemAcervo.java#L16), [Livro.java](src/models/Livro.java#L13) e [Revista.java](src/models/Revista.java#L11).
   - Sobrecarga de construtores nas classes [ItemAcervo.java](src/models/ItemAcervo.java#L16-L32), em [Livro.java](src/models/Livro.java#L13-L29) e [Revista.java](src/models/Revista.java#L11-L27) para permitir diferentes formas de inicialização dos objetos.

3. **Encapsulamento e Modificadores de Acesso:**
   - Atributos das classes de modelo definidos como `private`.
   - Modificador `protected` no método `setDisponivel()` em ItemAcervo.java, visível apenas pelas subclasses.
   - Métodos setters contendo validações (ex: ano de publicação em [Livro.java](src/models/Livro.java#L38-L44) e número da edição em [Revista.java](src/models/Revista.java#L36-L41)).

4. **Herança:**
   - Hierarquia com relacionamento "é um" onde [Livro.java](src/models/Livro.java#L7) e [Revista.java](src/models/Revista.java#L5) estendem a classe abstrata `ItemAcervo`.

5. **Polimorfismo:**
   - Sobrescrita de métodos (`@Override`):
     - `calcularPrazoDevolucao()` reescrito em [Livro.java](src/models/Livro.java#L47) (14 dias) e [Revista.java](src/models/Revista.java#L44) (7 dias).
     - `emprestar()` reescrito nas subclasses para mensagens customizadas.
   - Polimorfismo de Inclusão: Armazenamento e processamento uniforme de subclasses na lista polimórfica `List<ItemAcervo> acervo` em [Main.java](src/Main.java#L11) e laço de iteração.
   - O método `consultarPrazoDevolucao()` em [Main.java](src/Main.java#L200) demonstra despacho dinâmico, pois a chamada item.calcularPrazoDevolucao() executa a implementação correta (Livro ou Revista) em tempo de execução.

6. **Classes Abstratas e Interfaces:**
   - Classe abstrata `ItemAcervo` com o método abstrato `calcularPrazoDevolucao()`.
   - Interface [IEmprestavel.java](src/interfaces/IEmprestavel.java) definindo a assinatura de métodos que padronizam o empréstimo de itens.

7. **Tratamento de Exceções:**
   - Tratamento de erro de conversão com blocos `try-catch` em [Main.java](src/Main.java) para capturar `NumberFormatException`.
   - Exceção customizada [ItemIndisponivelException.java](src/exceptions/ItemIndisponivelException.java) para alertar tentativas de empréstimos duplicados.
   - Uso de try-catch para tratamento de entradas inválidas e exceções de negócio.
   - Uso de try-catch-finally na operação de empréstimo para garantir a execução de uma ação final independentemente do resultado da operação.

---

## Problemas Resolvidos pelo Sistema

### Inconsistência de Inventário
O sistema impede empréstimos duplicados por meio da exceção customizada ItemIndisponivelException.

### Corrupção de Dados
Validações impedem o cadastro de livros com ano futuro e revistas com edição inválida.

### Padronização dos Prazos de Devolução
O cálculo do prazo é automatizado através de polimorfismo, retornando 14 dias para livros e 7 dias para revistas.

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