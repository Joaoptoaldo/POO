# Sistema de Gestão de Frota

A agência espacial "Cosmos" precisa de um sistema para gerir diferentes tipos de naves da sua frota. Todas as
naves partilham características comuns, mas comportam-se de forma muito diferente quando realizam missões e
consomem combustível.

A sua tarefa é implementar as seguintes classes, respeitando estritamente as regras de negócio abaixo.

## 1. A Classe Base (Abstrata): `NaveEspacial`

Esta classe servirá de base para todas as outras naves da frota.

### Atributos (Encapsulamento)
- Todos os atributos devem ser **privados**.
- `identificador` (String): O nome ou código da nave.
- `combustivelMaximo` (double): A capacidade máxima do depósito.
- `combustivelAtual` (double): A quantidade de combustível no momento.
- `velocidadeBase` (double): A velocidade padrão da nave.

### Comportamentos (Métodos)
- **Construtor**: Deve inicializar todos os atributos. O `combustivelAtual` deve começar igual ao `combustivelMaximo`.
- **Getters e Setters**: Para todos os atributos.
- **Regra de Encapsulamento**: No setter do `combustivelAtual`, o valor nunca pode ser negativo e nunca pode ultrapassar o `combustivelMaximo`. Caso contrário, lance: `throw new CombustivelInvalidoException("Valor de combustível inválido!");`.
- **Método Abstrato (Polimorfismo)**: `public abstract double calcularConsumo(double distanciaEmAnosLuz);`
- **Método Concreto**: `public void viajar(double distancia)`. Este método deve:
    1. Chamar o método `calcularConsumo` para saber quanto combustível a viagem exigirá.
    2. Verificar se o `combustivelAtual` é suficiente.
    3. Se for suficiente, subtrair o valor consumido e imprimir: *"A nave [identificador] viajou [distância] anos-luz. Combustível restante: [valor]"*.

## 2. As Subclasses (Herança e Polimorfismo)

Deverá criar três subclasses que herdam de NaveEspacial. Cada uma tem atributos próprios e uma forma única
de calcular o consumo de combustível. Não se esqueça de encapsular os novos atributos e criar os construtores
adequados utilizando o super().

### A. `NaveCargueiro`
Naves pesadas desenhadas para transportar mantimentos.
- **Atributos extra**: `pesoCargaAtual` (double) e `capacidadeMaximaCarga` (double).
- **Regra de Encapsulamento**: O `pesoCargaAtual` não pode exceder a `capacidadeMaximaCarga`.
- **Polimorfismo (Cálculo de Consumo)**: A fórmula é: `(distancia * 0.5) + (pesoCargaAtual * 0.2)`.

### B. `NaveCombate`
Naves rápidas, mas com um peso adicional devido ao armamento.
 - **Atributos extra**: `numeroArmas` (int) e `escudoAtivado` (boolean).
- **Polimorfismo (Cálculo de Consumo)**: A fórmula base é `(distancia * 0.8)`. Se o escudo estiver ativado, o consumo total sofre um agravamento de 15% (multiplicar o resultado final por 1.15).

### C. `NaveExploracao`
Naves leves, eficientes e focadas em missões longas.
- **Atributos extra**: `possuiSensoresAvancados` (boolean).
- **Polimorfismo (Cálculo de Consumo)**: A fórmula base é `(distancia * 0.3)`. Se a nave possuir sensores avançados ativados, soma-se um valor fixo de **50.0** unidades de combustível, independentemente da distância.

### D. Criação de Exceções Personalizadas
- Crie a classe `CombustivelInvalidoException` (herda de `IllegalArgumentException` ou `Exception`).
- Crie a classe `CombustivelInsuficienteException` (herda de `Exception`).

## 3. A Classe Executável: `Main`

Esta será a classe com o método public static void main(String[] args). Deverá simular o funcionamento do
sistema:

1. **Lista de Naves**: Crie uma lista (Array ou `ArrayList<NaveEspacial>`).
2. **Instanciação**: Crie pelo menos uma `NaveCargueiro`, uma `NaveCombate` e uma `NaveExploracao`.
3. **Adição**: Adicione as três naves à lista.
4. **Teste de Encapsulamento**: Tente abastecer a `NaveCargueiro` com um valor superior ao seu máximo
permitido utilizando o setter, para garantir que a sua validação bloqueia a ação.
5. **Teste de Polimorfismo**: Utilize um ciclo (`for` ou `foreach`) para percorrer a lista de naves. Para cada nave
na lista:
    - Imprima o tipo de nave e o seu identificador.
    - Chame o método `viajar()` para uma distância de 1000 anos-luz.
6. **Tratamento de Erros**: Ao testar o encapsulamento e ao fazer as naves viajarem, envolva as chamadas em blocos `try-catch`. Imprima a mensagem da exceção (`e.getMessage()`) para confirmar que o bloqueio funcionou sem interromper o programa.