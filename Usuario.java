public class Usuario {
    //atributos privados (ngm acessa de fora da classe)
    private String nome;
    private Double peso;
    private Double altura;

    public void setNome(String nome){//metodo set para definir o nome
        this.nome = nome;
    }
    public String getNome(){//metodo get para acessar o nome
        return this.nome;
    }

    public void setPeso(double peso){
        if (peso > 0){
            this.peso = peso;
        }
        else{
            System.out.println("Peso inválido. O peso deve ser maior que zero.");
        }
    }

    public Double getPeso(){
        return this.peso;
    }

    public void setAltura(double altura){
        if (altura > 0){
            this.altura = altura;
        }
        else{
            System.out.println("Altura invalida. A altura deve ser maior que zero.");
        }
    }

    public Double getAltura(){
        return this.altura;
    }    

}
