import java.util.Scanner;

public class Main {

    // 3. Formulário de Idade (NumberFormatException)
    // Peça para o usuário digitar sua idade através da classe Scanner, mas leia a
    // entrada como uma String (usando nextLine()). Tente converter essa String para
    // inteiro usando Integer.parseInt(). Trate a exceção caso o usuário digite a
    // idade por extenso (ex: "vinte") e exiba um alerta: "Por favor, utilize apenas
    // algarismos numéricos".
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        String idadeStr = leitor.nextLine();

        try {
            int idade = Integer.parseInt(idadeStr);
            System.out.println("Sua idade é: " + idade);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, utilize apenas algarismos numéricos");
        } finally {
            leitor.close();
        }
    }
}
