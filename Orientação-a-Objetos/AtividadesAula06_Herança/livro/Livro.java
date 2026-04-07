package livro;

//12) Crie uma classe Livro com titulo e autor . 
// Crie uma subclasse Ebook que adiciona o atributo tamanhoArquivoMB .

public class Livro {
    protected String titulo;
    protected String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro {titulo='" + titulo + "', autor='" + autor + "'}";
    }
}
