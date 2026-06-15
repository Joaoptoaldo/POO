package marcenaria;

import java.io.IOException;

public class Marcenaria {
    public static void lerArquivo(String nomeArquivo) throws IOException {
        throw new IOException("Arquivo não encontrado: " + nomeArquivo);
    }
}
