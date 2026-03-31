package pessoa;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

}
