public class NotaInvalidaException extends Exception {
    /**
     * construtor da classe 
     * @param msg mensagem de erro a ser exibida quando a exceção for lançada
     */
    public NotaInvalidaException(String msg) {
        super(msg);
    }
}