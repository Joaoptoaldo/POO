import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        double x, y;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor de x: ");
        x = leitor.nextDouble();

        System.out.println("Digite o valor de y: ");
        y = leitor.nextDouble();

        if(x > 0 && y > 0){
            System.out.println("O ponto esta no primeiro quadrante");
        }
        else if(x < 0 && y > 0){
            System.out.println("O ponto esta no segundo quadrante");
        }
        else if(x < 0 && y < 0){
            System.out.println("O ponto esta no terceiro quadrante");
        }
        else if(x > 0 && y < 0){
            System.out.println("O ponto esta no quarto quadrante");
        }
        else if(x == 0){
            System.out.println("O ponto esta sobre o eixo x");
        }
        else if(y == 0){
            System.out.println("O ponto esta sobre o eixo y");
        }

        
    }
}
