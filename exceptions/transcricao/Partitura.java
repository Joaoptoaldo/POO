package transcricao;

public class Partitura {
    public String partitura;

    public Partitura() {
        this.partitura = "";
    }

    public void registrarAcorde(String acorde) throws AcordeInvalidoException {
        if (!acorde.matches("[CDEFGAB].*")) {
            throw new AcordeInvalidoException("Acorde inválido: " + acorde);
        }
        System.out.println("Registrou: " + acorde);
    }
}
