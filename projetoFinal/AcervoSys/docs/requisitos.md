### O projeto cumpre integralmente todos os requisitos descritos em `diretrizes.md`.  

| Requisito (diretrizes) | Como o código o satisfaz |
|------------------------|---------------------------|
| **1. Classes, objetos e atributos** | Existem as classes `ItemAcervo`, `Livro` e `Revista` (todos em `src/models`). Cada uma possui atributos privados (ex.: `private int anoPublicacao;` em `Livro`). |
| **2. Construtores** | `Livro` contém: <br>• construtor padrão (linhas 13‑16) <br>• construtor completo com disponibilidade (linhas 21‑24) <br>• construtor sobrecarregado com disponibilidade implícita (linhas 29‑32). <br> `Revista` tem padrão semelhante. |
| **3. Encapsulamento e modificadores** | Atributos são `private`; o método `setDisponivel` em `ItemAcervo` é `protected`. <br>Setters em `Livro` e `Revista` realizam validações (ex.: verificação de ano e edição). |
| **4. Herança** | `Livro` e `Revista` **estendem** `ItemAcervo` (`extends ItemAcervo`). |
| **5. Polimorfismo** | <br>• `@Override` de `calcularPrazoDevolucao()` em ambas as subclasses (14 dias para livros, 7 dias para revistas). <br>• `@Override` de `emprestar()` em `Livro` e `Revista`. <br>• A lista polimórfica `List<ItemAcervo> acervo` em `Main.java` permite tratamento uniforme de objetos diferentes. |
| **6. Classes abstratas e interfaces** | `ItemAcervo` é **abstrata** e declara o método abstrato `calcularPrazoDevolucao()`. <br> `IEmprestavel` define o contrato `emprestar()` / `devolver()`. |
| **7. Tratamento de exceções** | <br>• `Main.java` envolve todas as entradas em blocos `try‑catch‑finally`, capturando `NumberFormatException`, `IllegalArgumentException` e outras exceções. <br>• Exceção customizada `ItemIndisponivelException` é lançada nos métodos `emprestar()` de `Livro` e `Revista`. <br>• Mensagens de erro são exibidas para o usuário. |

