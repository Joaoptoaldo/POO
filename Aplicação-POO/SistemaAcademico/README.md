# Sistema Acadêmico (Validação de Dados)

    Contexto: O sistema universitário precisa garantir que notas inválidas não sejam lançadas
    no histórico dos alunos e que artigos sem título não sejam publicados.

## Instruções:

### 1. A Exceção:
○ Crie a classe DadosAcademicosInvalidosException (herda de
RuntimeException).
### 2. A Classe Base: Crie a classe abstrata MembroAcademico.
○ Atributos privados: nome e matricula.
○ Método abstrato: void mostrarFuncao().
### 3. As Interfaces:
○ Pesquisador: void publicarArtigo(String titulo).
○ Avaliador: void lancarNotas(double nota).
### 4. As Classes Filhas:
○ Professor: Implementa ambas as interfaces. Em lancarNotas, se a nota
for menor que 0 ou maior que 10, lance a
DadosAcademicosInvalidosException.
○ AlunoPosGraduacao: Implementa Pesquisador. Em publicarArtigo
(para ambas as classes), se o título for vazio ou nulo, lance também a
exceção.
### 5. Teste o Código:
○ No Main, crie uma List<MembroAcademico>. Adicione professores e
alunos.
○ Itere sobre a lista usando instanceof. Envolva as chamadas de publicar
artigo (passe uma string vazia para testar) e lançar notas (passe um valor
11.0) em blocos try-catch para garantir que o programa trate o erro e
continue a execução.