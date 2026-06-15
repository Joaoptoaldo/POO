# Plataforma de Streaming de Mídia (Simulação de Rede)
    Contexto: Downloads podem falhar devido a problemas de conexão ou falta de permissão
    na conta do usuário.

## Instruções:
### 1. A Exceção:
○ Crie FalhaNoDownloadException (herda de Exception).
### 2. A Classe Base: Midia.
○ Atributos privados: titulo e duracaoSegundos.
○ Método abstrato: void reproduzir().
### 3. As Interfaces:
○ Baixavel: void realizarDownload(boolean conexaoEstavel)
throws FalhaNoDownloadException.
○ Compartilhavel: String gerarLink().
### 4. As Classes Filhas:
○ Musica (implementa ambas), Filme (implementa Baixavel), Podcast
(implementa Compartilhavel).
○ Nas classes que implementam Baixavel, se o parâmetro
conexaoEstavel for false, lance a FalhaNoDownloadException ("Erro
de rede: Não foi possível baixar [titulo]").
### 5. Teste o Código:
○ No Main, crie a lista playlist e adicione as mídias.
○ Itere sobre a lista. Quando a mídia for Baixavel, chame
realizarDownload(false) deliberadamente para forçar o erro de
conexão.
○ Envolva a chamada em um try-catch para que, se o download falhar, o
programa avise o usuário na tela, mas continue reproduzindo as próximas
mídias da playlist.