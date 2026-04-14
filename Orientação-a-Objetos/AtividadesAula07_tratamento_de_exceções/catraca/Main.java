package catraca;
// 4. Catraca do estadio
// Crie uma classe Catraca com um método validarIngresso(int idadeTorcedor, boolean isSocio). Se o torcedor não for sócio do Internacional e tiver menos de 18 anos sem acompanhante, utilize a palavra-chave throw para lançar uma IllegalArgumentException com a mensagem: "Acesso negado: Menores não-sócios precisam de acompanhante." Crie o main para testar a chamada capturando o erro. 

public class Main {
    public static void main(String[] args) {
        Catraca catraca = new Catraca();
        
        System.out.println("Teste 1");
        try {
            catraca.validarIngresso(16, false);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Teste 2");
        try {
            catraca.validarIngresso(16, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }

        System.out.println("Teste 3");
        try {
            catraca.validarIngresso(20, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }

        System.out.println("Teste 4");
        try {
            catraca.validarIngresso(20, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }
    }
}
