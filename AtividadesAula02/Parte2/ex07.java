package Atividades_Aula_02.Parte2;

public class ex07 {
    //7 - Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.
    public static void main(String[] args) {
        double[][] notas = new double[3][4];
        
    
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Digite a nota do aluno " + (i + 1) + " na disciplina " + (j + 1) + ":");
                notas[i][j] = Double.parseDouble(System.console().readLine());
            }
        }
        
        for (int j = 0; j < notas[0].length; j++) {
            double maiorNota = notas[0][j];
            double menorNota = notas[0][j];
            
            for (int i = 1; i < notas.length; i++) {
                if (notas[i][j] > maiorNota) {
                    maiorNota = notas[i][j];
                }
                if (notas[i][j] < menorNota) {
                    menorNota = notas[i][j];
                }
            }
            
            System.out.println("Disciplina " + (j + 1) + ":");
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
        }
    }
}
