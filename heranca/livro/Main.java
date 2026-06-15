package livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", "J.K. Rowling");
        Ebook ebook = new Ebook("Ebook java POO", "João Pedro", 5.5);

        System.out.println(livro.toString());
        System.out.println(ebook.toString());
    }
}
