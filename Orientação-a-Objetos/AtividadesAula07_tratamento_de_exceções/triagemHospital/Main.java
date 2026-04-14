import java.util.InputMismatchException;
// 7. Triagem no Hospital(Hierarquia de Exceções)

// Crie um sistema simples de cadastro de pacientes para o hospital. O método de cadastro pode gerar duas exceções: NullPointerException (se o nome estiver vazio) ou InputMismatchException (se o peso digitado for inválido). Crie um bloco try com múltiplos catch. Ao final, adicione um catch genérico para Exception e (polimorfismo) para capturar qualquer outro erro imprevisto, imprimindo: "Erro interno no sistema do hospital: " + e.getMessage().

public class Main {
    public static void main(String[] args) {
        
        try {
            Cadastro.cadastrarPaciente("", 70);
        } catch (NullPointerException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } catch (InputMismatchException erro) {
            System.out.println("Erro: " + erro.getMessage());
        } catch (Exception erro) {
            System.out.println("Erro interno no sistema do hospital: " + erro.getMessage());
        }
    }
}
