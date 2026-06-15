# Diretrizes para o Trabalho Final: Programação Orientada a Objetos em Java

## Objetivo
Este trabalho final tem como objetivo consolidar os conhecimentos adquiridos ao longo do semestre. Você deve projetar e desenvolver um sistema em Java que resolva um problema do mundo real, aplicando rigorosamente os pilares e conceitos fundamentais da Programação Orientada a Objetos (POO).


## Pré-requisitos Obrigatórios
O projeto deve, obrigatoriamente, contemplar e justificar o uso dos seguintes elementos:

### 1. Classes, Objetos e Atributos
- **Requisito:** O sistema deve possuir entidades bem definidas que modelem o problema escolhido.
- **Aplicação:** Criação de classes com coesão, instanciação de múltiplos objetos no fluxo principal de execução (main) e definição de atributos com tipos de dados adequados.

### 2. Construtores
- **Requisito:** Os objetos devem ser inicializados em estados válidos.
- **Aplicação:** Implementação de construtores padrão e construtores parametrizados. Pelo menos uma classe deve demonstrar a sobrecarga de construtores (múltiplas formas de inicializar o mesmo tipo de objeto).

### 3. Encapsulamento e Modificadores de Acesso
- **Requisito:** O estado interno dos objetos deve ser protegido contra modificações indevidas.
- **Aplicação:** Uso estrito de modificadores de acesso (private, protected, public). O acesso aos atributos deve ser feito por meio de métodos getters e setters, ou através de métodos de negócio que validem as informações antes de alterar o estado do objeto.

### 4. Herança
- **Requisito:** O sistema deve demonstrar reaproveitamento de código e especialização de comportamento.
- **Aplicação:** Criação de pelo menos uma hierarquia de classes. Deve ficar claro o relacionamento "É UM" (ex: Professor é um Funcionario).

### 5. Polimorfismo
- **Requisito:** Objetos de tipos diferentes devem poder ser tratados de forma uniforme.
- **Aplicação:**
    - **Sobrescrita (Override):** Subclasses devem reescrever métodos da superclasse para comportamentos específicos.
    - **Polimorfismo de Inclusão:** Coleções (como ArrayList) ou parâmetros de métodos devem utilizar o tipo da superclasse para interagir com instâncias das subclasses.

### 6. Classes Abstratas e Interfaces
- **Requisito:** Definição de contratos e abstrações de alto nível.
- **Aplicação:**
    - No mínimo uma **Interface**, definindo um contrato de métodos que devem ser obrigatoriamente implementados por classes distintas.
    - No mínimo uma **Classe Abstrata**, servindo como base conceitual que não pode ser instanciada diretamente, contendo pelo menos um método abstrato.

### 7. Tratamento de Exceções
- **Requisito:** O sistema deve ser tolerante a falhas e tratar condições anormais de maneira satisfatória.
- **Aplicação:** Uso de blocos `try-catch-finally` para capturar exceções previsíveis (como erros de entrada do usuário ou falhas de conversão). Além disso, o grupo deve criar e lançar pelo menos uma exceção customizada (ex: `SaldoInsuficienteException` ou `IdadeInvalidaException`) para proteger as regras de negócio.

