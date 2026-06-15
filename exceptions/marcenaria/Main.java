package marcenaria;
import java.io.IOException;
// 5. Projeto de Marcenaria (IOException e finally)

// Simule a leitura de um arquivo de instruções de corte. Crie um método que declare throws IOException e tente ler um arquivo chamado projeto_mesa.txt. Force o lançamento da IOException. No main, faça o try-catch. Adicione um bloco finally que imprima no console: "Limpando a bancada e desligando as máquinas...", garantindo que esta mensagem apareça sempre, com ou sem erro no arquivo.

public class Main {
  public static void main(String[] args) {
      try {
          Marcenaria.lerArquivo("projeto_mesa.txt");
      } catch (IOException erro) {
          System.out.println("Erro ao ler o arquivo: " + erro.getMessage());
      } finally {
          System.out.println("Limpando a bancada e desligando as máquinas...");
      }
  }
}
