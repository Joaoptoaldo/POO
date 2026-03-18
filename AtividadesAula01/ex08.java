package Atividades_Aula_01;

public class ex08 {
    public static void main(String[] args) {
        int idade;
        
        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(System.console().readLine());

        if(idade < 16){
            System.out.println("Não eleitor");
        }
        else if(idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Eleitor facultativo");
        }
        else{
            System.out.println("Eleitor obrigatório");
        }
    }
}
