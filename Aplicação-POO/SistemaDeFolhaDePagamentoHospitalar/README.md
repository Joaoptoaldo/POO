# Sistema de Folha de Pagamento Hospitalar

O "Hospital de Caridade UFN" precisa de um sistema para processar a folha de pagamento dos seus funcionários. Embora todos sejam funcionários, os médicos, enfermeiros e a equipe administrativa possuem regras salariais completamente diferentes, como horas extra, insalubridade e plantões.

A sua tarefa é implementar as classes abaixo aplicando Encapsulamento, Herança e Polimorfismo.

## 1. A Classe Base (Abstrata): `FuncionarioHospital`

Esta é a classe mãe para todos os trabalhadores do hospital.

### Atributos (Encapsulamento)

- Todos os atributos devem ser privados.
- `nome` (`String`)
- `matricula` (`String`)
- `salarioBase` (`double`)
- `horasTrabalhadasMensais` (`int`)

### Comportamentos (Métodos)

- Crie um construtor que receba e inicialize `nome`, `matricula` e `salarioBase`.
- `horasTrabalhadasMensais` deve começar sempre em `0`.
- Crie getters e setters para todos os atributos.
- No setter de `salarioBase`, o valor não pode ser inferior ao salário mínimo. Considere `R$ 1.412,00`. Se for menor, lance `throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.")`.
- No setter de `horasTrabalhadasMensais`, o valor nunca pode ser negativo nem superior a `300`. Se for inválido, lance `throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.")`.
- Crie um método abstrato de polimorfismo: `public abstract double calcularSalarioFinal();`
- Crie um método concreto: `public void exibirResumoMensal()`. Este método deve imprimir o nome, a matrícula, as horas trabalhadas e o salário final, chamando o método abstrato.

## 2. As Subclasses (Herança e Polimorfismo)

Crie três subclasses que herdam de `FuncionarioHospital`. Não se esqueça de usar `super()` nos construtores e de encapsular adequadamente os novos atributos.

### A. `Medico`

Os médicos ganham o salário base mais um valor fixo por cada plantão realizado.

- Atributos extra: `especialidade` (`String`), `valorPorPlantao` (`double`) e `quantidadePlantoes` (`int`).
- Regra de encapsulamento: `quantidadePlantoes` não pode ser negativa.
- Polimorfismo (cálculo de salário): `salarioBase + (valorPorPlantao * quantidadePlantoes)`.

### B. `Enfermeiro`

Os enfermeiros têm direito a um adicional de insalubridade e recebem horas extras. A carga horária padrão é de `160` horas mensais.

- Atributos extra: `setor` (`String`) e `percentualInsalubridade` (`double`).
- Regra de encapsulamento: `percentualInsalubridade` só pode aceitar os valores `0.10` (mínimo), `0.20` (médio) ou `0.40` (máximo). Qualquer outro valor deve lançar `throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.")` e não ser atribuído.
- Polimorfismo (cálculo de salário):
  1. Calcule o bônus de insalubridade: `salarioBase * percentualInsalubridade`.
  2. Verifique as `horasTrabalhadasMensais`. Se ultrapassarem `160`, cada hora extra vale `R$ 50,00`.
  3. O salário final é a soma de `salarioBase + bônus de insalubridade + valor das horas extras`.

### C. `Administrativo`

O pessoal do escritório não recebe insalubridade nem plantões, mas pode receber um bônus se ocupar um cargo de chefia.

- Atributos extra: `departamento` (`String`) e `cargoDeGestao` (`boolean`).
- Polimorfismo (cálculo de salário): o salário final é simplesmente `salarioBase`. Porém, se `cargoDeGestao == true`, recebe um bônus fixo de `R$ 1.500,00` adicionado ao salário final.

### D. Criação de Exceções Personalizadas

- Crie a classe `ValorInvalidoException` que herda de `RuntimeException`.
- Ela pode ser usada para abranger todas as falhas de validação deste exercício.

## 3. A Classe Executável: `Main`

Aqui você irá testar a robustez do seu código.

### Passos

1. Crie uma lista, por exemplo `ArrayList<FuncionarioHospital>`, para representar a folha de pagamento do hospital.
2. Instancie:
	- Um `Medico` cirurgião com `5` plantões.
	- Um `Enfermeiro` da UTI com insalubridade máxima (`0.40`) e `180` horas trabalhadas.
	- Um `Administrativo` dos Recursos Humanos que é gestor (`true`).
3. Adicione todos à lista.
4. Teste o encapsulamento propositalmente:
	- Tente alterar o salário base do `Administrativo` para `R$ 900,00`.
	- Tente definir a insalubridade do `Enfermeiro` para `0.99`.
	- Tente definir as horas trabalhadas do `Medico` para `400`.
	- Envolva as três tentativas em blocos `try-catch` separados. Dessa forma, o programa capturará os três erros sequencialmente, imprimirá as mensagens e continuará a execução normal para calcular a folha de pagamento.
5. Teste o polimorfismo:
	- Utilize um ciclo para percorrer a lista de funcionários.