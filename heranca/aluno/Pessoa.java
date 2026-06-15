package aluno;

// 9) Crie uma classe Pessoa com nome e idade . Crie uma subclasse Aluno com o atributo matricula . 
// Sobrescreva o método toString() em Aluno para exibir todas as informações.

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // @Override
    // public String toString() {
    //     return "Pessoa {" +
    //             "nome='" + nome + '\'' +
    //             ", idade=" + idade +
    //             '}';
    // }

}
