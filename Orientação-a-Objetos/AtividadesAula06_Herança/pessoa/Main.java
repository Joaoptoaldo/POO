package pessoa;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "2023203");

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Idade: " + aluno.idade);
        System.out.println("Matrícula: " + aluno.matricula);
    }
    
}
