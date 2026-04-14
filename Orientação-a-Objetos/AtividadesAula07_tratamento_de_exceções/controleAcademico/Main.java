package controleAcademico;

// 10. Propagação e Encapsulamento de Erros
// Crie uma arquitetura em 3 camadas simulando um sistema de controle acadêmico:
// Camada de Banco de Dados: Método buscarAluno(int matricula) que lança uma exceção genérica SQLException (simulando falha de conexão).
// Camada de Negócio: Método gerarBoletim(int matricula). Este método chama o buscarAluno. Ao invés de usar throws SQLException (vazando detalhes técnicos de banco de dados), ele deve capturar a SQLException e dentro do catch lançar uma nova exceção customizada chamada AlunoNaoEncontradoException.
// Camada de Interface (main): Chama o gerarBoletim e trata apenas a AlunoNaoEncontradoException, exibindo uma mensagem amigável para o usuário final

public class Main {
    public static void main(String[] args) {
        try {
            gerarBoletim(12345); // matrícula inexistente
        } catch (AlunoNaoEncontradoException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }

    // camada de Negócio
    public static void gerarBoletim(int matricula) throws AlunoNaoEncontradoException {
        try {
            // camada de Banco de Dados
            buscarAluno(matricula);
            System.out.println("Boletim gerado para matrícula: " + matricula);
        } catch (java.sql.SQLException excecao) {
            throw new AlunoNaoEncontradoException("Aluno não encontrado para matrícula: " + matricula);
        }
    }

    // camada de banco de dados
    public static void buscarAluno(int matricula) throws java.sql.SQLException {
        // simula falha de conexão ou matrícula inexistente
        throw new java.sql.SQLException("Falha ao buscar aluno no banco de dados");
    }
}
