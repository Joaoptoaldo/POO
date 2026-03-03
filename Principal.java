public class Principal {
    public static void main(String[] args){
        Usuario u1 = new Usuario();

        u1.setNome("João Toaldo");
        u1.setPeso(75.5);

        System.out.println("Nome: " + u1.getNome());
        System.out.println("Peso: " + u1.getPeso());

    }
}

