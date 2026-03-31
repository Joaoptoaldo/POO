package aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estudante aluno = new Estudante();

        System.out.println("Digitando uma nota válida:");
        aluno.setNota(8.5);
        System.out.println("\nNota atual no sistema: " + aluno.getNota());

        leitor.close();
    }
}
