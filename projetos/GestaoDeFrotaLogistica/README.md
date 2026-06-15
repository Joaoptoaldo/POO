# Gestão de Frota Logística (Exceções de Regra de Negócio)

    Contexto: Ao gerenciar veículos refrigerados, a temperatura da carga não pode ultrapassar
    limites críticos que estraguem os produtos perecíveis.

## Instruções:

### 1. A Exceção:
○ Crie a classe TemperaturaCriticaException (herda de Exception).

### 2. A Classe Base: 

Crie a classe abstrata Veiculo.
○ Atributos privados: placa e capacidadeCarga.
○ Métodos: protected void registrarManutencao() e o abstrato void
iniciarViagem().

### 3. As Interfaces:

○ Rastreador: método String obterLocalizacao().
○ Refrigerado: método void ajustarTemperatura(double graus)
throws TemperaturaCriticaException.

### 4. As Classes Filhas:
○ CaminhaoPadrao (herda Veiculo, implementa Rastreador).
○ VanRefrigerada (herda Veiculo, implementa Rastreador e
Refrigerado).
○ Na VanRefrigerada, ao implementar ajustarTemperatura, se os graus
forem maiores que 10.0 ou menores que -20.0, lance a
TemperaturaCriticaException informando que a carga pode ser
comprometida.

### 5. Teste o Código:

○ Instancie os veículos no Main.
○ Crie um bloco try-catch para tentar ajustar a temperatura da Van para
15.0 (o que deve gerar o erro) e outro para ajustar para 2.0 (o que deve
funcionar).