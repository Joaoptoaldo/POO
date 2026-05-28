# Jogo de RPG - Sistema de Batalha Seguro
    Contexto: Em um sistema de batalha, personagens não podem ser atacados ou curados se
    já estiverem derrotados (Vida = 0).

## Instruções:
### 1. As Exceções:
○ Crie AlvoInvalidoException (herda de Exception).

### 2. A Classe Base: Personagem.
○ Atributos privados: nome e pontosVida. O Setter de vida não deve permitir
valores abaixo de zero.
○ Método abstrato: void atacar(Personagem alvo) throws
AlvoInvalidoException.

### 3. As Interfaces:
○ Magico: void lancarFeitico(Personagem alvo) throws
AlvoInvalidoException.
○ Curandeiro: void curarAliado(Personagem aliado) throws
AlvoInvalidoException.

### 4. As Classes Filhas:
○ Guerreiro, Paladino e Mago.
○ Em todas as implementações de ataques e curas, faça uma verificação: se o
alvo (ou aliado) tiver 0 pontos de vida, lance a AlvoInvalidoException
com a mensagem "[Nome do alvo] já está fora de combate!".

### 5. Teste o Código:
○ No Main, instancie os personagens.
○ Simule ataques repetidos em um bloco de repetição até a vida de um
personagem chegar a zero.
○ Dentro de um try-catch, tente atacar o personagem que já está com a
vida zerada para forçar o disparo e a captura da exceção.