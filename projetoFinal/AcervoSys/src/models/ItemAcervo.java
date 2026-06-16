package models;

import exceptions.ItemIndisponivelException;
import interfaces.IEmprestavel;

/**
 * classe abstrata que representa um item do acervo
 */
public abstract class ItemAcervo implements IEmprestavel {
    private String titulo;
    private String autor;
    private boolean disponivel;

    /**
     * construtor padrão (sem parâmetros)
     */
    public ItemAcervo() {
        this("Sem título", "Sem autor", true);
    }

    /**
     * construtor parametrizado completo
     */
    public ItemAcervo(String titulo, String autor, boolean disponivel) {
      this.titulo = titulo;
      this.autor = autor;
      this.disponivel = disponivel;
    }

    /**
     * construtor parametrizado (disponibilidade padrão como true)
     */
    public ItemAcervo(String titulo, String autor) {
        this(titulo, autor, true);
    }

    public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }

    public String getAutor() {
      return autor;
    }

    public void setAutor(String autor) {
      this.autor = autor;
    }


    protected void setDisponivel(boolean disponivel) {
      this.disponivel = disponivel;
    }    

    @Override
    public void emprestar() throws ItemIndisponivelException {
      if (!isDisponivel()) {
        throw new ItemIndisponivelException("O item '" + getTitulo() + "' já se encontra emprestado");
      }
      setDisponivel(false);
    }

    @Override
    public void devolver() {
        this.disponivel = true;
    }

    /**
     * método que verifica se o item está disponível
     * @return retorna true se o item estiver disponível, false caso contrário
     */
    public boolean isDisponivel() {
      return disponivel;
    }

    /**
     * método que define o prazo de devolução de cada item
     * @return retorna um int que representa o prazo de devolução
     */
    public abstract int calcularPrazoDevolucao();

    /**
     * método que retorna a representação em string do item
     * @return string formatada contendo o título, autor e disponibilidade do item
     */
    @Override
    public String toString() {
        return String.format("%s - %s [%s]", titulo, autor, (disponivel ? "Disponível" : "Indisponível"));
    }
}