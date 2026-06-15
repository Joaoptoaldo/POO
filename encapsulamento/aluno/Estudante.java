// 2 - Crie uma classe Estudante com o atributo nota . 
// O método setNota(double nota) deve garantir que a nota esteja estritamente entre 0 e 10. 
// Se for inválida, a nota não deve ser alterada.
package aluno;

public class Estudante {
    private double nota;

    public Estudante(){
        this.nota = 0.0;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
            System.out.println("Nota " + nota + " atribuída com sucesso!");
        }
        else{
            System.err.println("[ERRO] Nota inválida: " + nota + ". A nota deve estar entre 0 e 10.");
        }
    }
}