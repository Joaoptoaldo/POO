import java.util.InputMismatchException;

public class Cadastro {
    public static void cadastrarPaciente(String nome, double peso) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NullPointerException("Nome não pode estar vazio.");
        }
        if (peso <= 0) {
            throw new InputMismatchException("Peso inválido. Tem que ser positivo.");
        }
        System.out.println("Paciente cadastrado: " + nome + ", Peso: " + peso + " kg");
    }
}
