package Atividades_Aula_02.Parte2;

public class ex06 {
    //6 - Escreva um programa Java que use um vetor para ler os nomes de 5 cidades e outro vetor para armazenar as suas respectivas populações e depois imprima na tela o nome da cidade mais populosa.
    public static void main(String[] args) {
        String[] cidades = new String[5];
        int[] populacoes = new int[5];
        
        // Leitura dos nomes das cidades e suas populações
        for (int i = 0; i < cidades.length; i++) {
            System.out.println("Digite o nome da cidade " + (i + 1) + ":");
            cidades[i] = System.console().readLine();
            System.out.println("Digite a população da cidade " + (i + 1) + ":");
            populacoes[i] = Integer.parseInt(System.console().readLine());
        }
        
        // Encontrar a cidade mais populosa
        int indiceMaisPopulosa = 0;
        for (int i = 1; i < populacoes.length; i++) {
            if (populacoes[i] > populacoes[indiceMaisPopulosa]) {
                indiceMaisPopulosa = i;
            }
        }
        
        // Imprimir o nome da cidade mais populosa
        System.out.println("A cidade mais populosa é: " + cidades[indiceMaisPopulosa]);
    }
    
}
