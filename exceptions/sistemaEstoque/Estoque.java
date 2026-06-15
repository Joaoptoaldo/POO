package sistemaEstoque;

public class Estoque {
    private double quantidadeMdf;
    private double quantidadePinos;

    public Estoque(double quantidadeMdf, double quantidadePinos) {
        this.quantidadeMdf = quantidadeMdf;
        this.quantidadePinos = quantidadePinos;
    }

    public void cortarPeca(String tipo, double metros) {
        if (tipo.equalsIgnoreCase("MDF")) {
            if (metros > quantidadeMdf) {
                throw new MadeiraInsuficienteException("Não tem MDF suficiente!");
            }
            quantidadeMdf -= metros;
            System.out.println("Cortei " + metros + " metros de MDF");
        } 
        
        else if (tipo.equalsIgnoreCase("Pinos")) {
            if (metros > quantidadePinos) {
                throw new MadeiraInsuficienteException("Não tem pinos suficientes!");
            }
            quantidadePinos -= metros;
            System.out.println("Cortei " + metros + " metros de pinos");
        } 
        else {
            System.out.println("Tipo de madeira não reconhecido.");
        }
    }
}
