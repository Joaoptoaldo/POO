# Sistema de Chão de Fábrica (Indústria 4.0)

A empresa "TecnoForja S.A." encomendou um sistema de gestão para a sua nova linha de produção automatizada. O sistema deve controlar diferentes tipos de máquinas industriais, monitorizar o seu desgaste, consumo energético e validar se conseguem ou não fabricar um lote de peças.

## 1. A Classe Base (Abstrata): MaquinaIndustrial

Esta classe define o comportamento padrão de qualquer equipamento na fábrica.

- Atributos (Encapsulamento Estrito):
	- numeroSerie (String) - Imutável após a criação.
	- ligada (boolean) - O estado atual da máquina (true = ligada, false = desligada).
	- pecasProduzidasTotais (int) - Acumulador do histórico da máquina.
	- energiaConsumidaKWh (double) - Acumulador de energia gasta.

- Comportamentos e Regras de Encapsulamento:
	- Crie um construtor que receba apenas o numeroSerie. Todas as máquinas começam desligadas e com zero peças e zero energia consumida.
	- Getters: Crie getters para todos os atributos.
	- Setters: Não crie NENHUM setter público. O estado da máquina só pode ser alterado por métodos específicos.
	- Crie os métodos ligar() e desligar().
		- Regra: Se chamar ligar() numa máquina já ligada, deve lançar IllegalStateException nativa do Java se chamados de forma redundante (ex: ligar o que já está ligado). O mesmo para desligar().
	- Crie um método protegido protected void registrarProducao(int pecas, double energia). Este é o único método que adiciona valores ao total de peças e à energia consumida.
	- Método Abstrato (Polimorfismo):public abstract void produzirLote(int quantidade) throws Exception;
		- Objetivo: Tentar produzir um lote. Em vez de retornar algo, não retorna nada, mas avisa que pode falhar:

## 2. As Subclasses (Herança, Polimorfismo e Máquinas de Estado)

Área: Ciências Tecnológicas  
Curso: Sistemas de Informação  
Disciplina: Programação Orientada a Objetos  
Professor: Rafael Bisogno

Deverá criar três subclasses. Em todas elas, a primeira regra do método produzirLote é: se a máquina estiver desligada, imprime um erro, retorna false e não faz mais nada.

### A. InjetoraPlastico

Derrete plástico para moldar peças.

- Estado Interno Extra: kgMateriaPrima (double).
- Comportamento Extra: Método abastecerPlastico(double kg), que adiciona matéria-prima ao reservatório (não pode ser negativo).
- Polimorfismo (produzirLote): * Cada peça necessita de 0.2 kg de matéria-prima.
	- Verifique se há plástico suficiente para a quantidade pedida. Se não houver plástico, lance FaltaMateriaPrimaException.
	- Se houver, subtrai o plástico gasto, calcula a energia (cada peça consome 0.5 kWh nesta máquina), chama o método registrarProducao() da superclasse, imprime o sucesso da operação e retorna true.

### B. BracoRoboticoMontagem

Equipamento de altíssima precisão, mas que perde calibração com o uso contínuo.

- Estado Interno Extra: percentualCalibracao (double - começa sempre em 100.0).
- Comportamento Extra: Método recalibrar(), que restaura a calibração para 100.0.
- Polimorfismo (produzirLote): * O robô recusa-se a trabalhar se a sua calibração atual for inferior a 20.0. Se for inferior a 20.0, lance EquipamentoDescalibradoException.
	- Se tiver calibração, produz o lote. O consumo de energia é um valor fixo de 15.0 kWh por lote (independentemente do tamanho do lote, pois o robô faz a rotina inteira).
	- Atenção: Cada peça produzida reduz o percentualCalibracao em 0.5. Atualize a calibração após o lote, garanta que não desce abaixo de zero, registre a produção e retorne true.

### C. PrensaHidraulica

Máquina de força bruta. Aquece muito e precisa de ciclos de arrefecimento.

- Estado Interno Extra: temperaturaAtual (double - começa em 25.0 graus).
- Comportamento Extra: Método acionarRefrigeracao(), que reduz a temperatura de volta para 25.0.
- Polimorfismo (produzirLote): * O limite térmico de segurança é 90.0 graus. Se a temperatura for igual ou superior a 90.0 graus antes de iniciar, lance SuperaquecimentoException.
	- Cada peça prensada aumenta a temperatura da máquina em 1.5 graus e consome 2.0 kWh.
	- Realize a produção, aumente a temperatura em conformidade, registe o lote e retorne true. (Nota: A máquina pode ultrapassar os 90 graus durante a produção do lote, o bloqueio só acontece se tentar iniciar um novo lote já estando acima do limite).

Área: Ciências Tecnológicas  
Curso: Sistemas de Informação  
Disciplina: Programação Orientada a Objetos  
Professor: Rafael Bisogno

Nota para todas as subclasses: A primeira linha do produzirLote deve verificar se a máquina está desligada. Se estiver, lance MaquinaDesligadaException.

### D. Criação de Exceções Personalizadas (Alarmes da Fábrica):

Crie as seguintes classes que herdam de Exception (obrigando o tratamento via try-catch):

- MaquinaDesligadaException
- FaltaMateriaPrimaException
- EquipamentoDescalibradoException
- SuperaquecimentoException

## 3. A Classe Executável: Main

1. Crie uma List<MaquinaIndustrial> e adicione uma Injetora, um Braço Robótico e uma Prensa.
2. Abasteça a Injetora com 10 kg de plástico.
3. Tente mandar todas as máquinas produzirem um lote de 60 peças antes de as ligar (deve falhar e testar a sua lógica base). Use um try-catch para capturar a MaquinaDesligadaException.
4. Ligue todas as máquinas através de um ciclo.
5. Inicie um turno de trabalho: faça um ciclo que mande todas as máquinas produzirem 3 lotes seguidos de 40 peças cada.
	 - O que deve acontecer (graças ao polimorfismo):
		 1. A injetora deve falhar no 2º ou 3º lote (ficará sem plástico).
		 2. O robô deve falhar no 3º lote (a calibração vai cair abaixo de 20%).
		 3. A prensa deve sobreaquecer e falhar em algum momento.
		 4. Envolva a chamada produzirLote num bloco try-catch múltiplo (ou capturando a superclasse genérica Exception).
6. O Comportamento Esperado: Quando a injetora ficar sem plástico, o programa lançará a exceção. O seu bloco catch deve capturá-la, imprimir "ALARME INJETORA: Falta matéria prima!", e permitir que o loop continue para tentar operar o robô e a prensa, simulando uma linha de produção onde uma máquina parar não desliga a fábrica inteira.
7. Imprima um relatório final para cada máquina mostrando o número de série, o total de peças efetivamente produzidas e a energia total consumida.