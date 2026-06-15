package catraca;

public class Catraca {
    public int idade;
    public boolean socio;

    public void validarIngresso(int idade, boolean socio) {
        if (!socio && idade < 18) {
            throw new IllegalArgumentException("Acesso negado: Menores não-sócios precisam de acompanhante.");
        }
        System.out.println("Pode entrar!");
    }
}
