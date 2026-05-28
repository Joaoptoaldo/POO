public interface Avaliavel {
  
    /**
     * método que adiciona uma avaliação a um produto
     * @param nota nota da avaliação, deve ser entre 1 e 5
     * @throws NotaInvalidaException exceção lançada quando a nota é inválida (menor que 1 ou maior que 5)
     */
    default void adicionarAvaliacao(int nota) throws NotaInvalidaException{

      if(nota < 1 || nota > 5){
          throw new NotaInvalidaException("A nota deve ser entre 1 e 5");
      }
      System.out.println("Nota " + nota + " adicionada com sucesso!");
  }
}