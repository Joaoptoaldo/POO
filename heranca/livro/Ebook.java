package livro;

public class Ebook extends Livro {
    private double tamanhoArquivoMB;

    public Ebook(String titulo, String autor, double tamanhoArquivoMB) {
        super(titulo, autor);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    @Override
    public String toString() {
        return "Ebook {titulo='" + 
        getTitulo() + "', autor='" + 
        getAutor() + "', tamanhoArquivoMB=" + 
        tamanhoArquivoMB + "MB}";
    }
}
