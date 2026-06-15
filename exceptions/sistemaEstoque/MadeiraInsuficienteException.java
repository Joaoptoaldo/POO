package sistemaEstoque;

public class MadeiraInsuficienteException extends RuntimeException {
    public MadeiraInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
