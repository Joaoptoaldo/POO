package transcricao;

// 8. Transcrição de Partituras (Exceção Checked Customizada) 

// Crie uma exceção personalizada chamada AcordeInvalidoException que herde de Exception (obrigando o tratamento). Crie uma classe Partitura com um método registrarAcorde(String acorde). Se o acorde não contiver as letras C, D, E, F, G, A ou B, lance a exceção. O aluno deve demonstrar que quem chama registrarAcorde é obrigado pelo compilador a usar try-catch ou propagar com throws.

public class Main {
    public static void main(String[] args) {
        Partitura partitura = new Partitura();
        try {
            partitura.registrarAcorde("Cmaj7");
            partitura.registrarAcorde("H7");
        } catch (AcordeInvalidoException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
