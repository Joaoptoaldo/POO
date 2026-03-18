
public class ex07 {
    public static void main(String[] args) {
        int n1, n2;

        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(System.console().readLine());

        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(System.console().readLine());

        if (n1 == 0 || n2 == 0) {
            System.out.println("Zero não é múltiplo de ninguém (e não se divide por zero).");
        } 
        else if (n1 % n2 == 0 || n2 % n1 == 0) {
            System.out.println("São múltiplos!");
        } 
        else {
            System.out.println("Não são múltiplos.");
        }

    }
}