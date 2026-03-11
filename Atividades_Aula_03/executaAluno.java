package Atividades_Aula_03;

import java.util.Scanner;

public class executaAluno {
    public static void main(String[] args) { 
        Scanner leitor = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.print("Informe o nome do aluno: ");
        aluno.nome = leitor.nextLine();
        
        System.out.print("Informe a matricula: ");
        aluno.matricula = leitor.nextInt();
        
        System.out.print("Informe a nota 1: ");
        aluno.nota1 = leitor.nextInt(); 
        
        System.out.print("Informe a nota 2: ");
        aluno.nota2 = leitor.nextInt();
        
        System.out.print("Informe a nota 3: ");
        aluno.nota3 = leitor.nextInt();
        
        double media = (aluno.nota1 + aluno.nota2 + aluno.nota3) / 3;

        System.out.println("\nResultado");
        System.out.println("Aluno: " + aluno.nome);
        System.out.println("Média: " + media);

        if(media >= 6) {
            System.out.println("Situação: Aprovado");
        } 
        if(media < 6) {
            System.out.println("Situação: Reprovado");
        }
        
        leitor.close(); 
    }
}
