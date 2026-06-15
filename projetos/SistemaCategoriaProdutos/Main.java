package SistemaCategoriaProdutos;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Produto> produtos = new ArrayList<>();

    produtos.add(new Eletronico("PC", 7500.00));
    produtos.add(new Vestuario("Camiseta", 79.90));
    produtos.add(new Alimento("Arroz", 25.00));

    double totalImposto = 0.0;

    for (Produto produto : produtos) {
      if (produto instanceof Tributavel) {
        totalImposto += ((Tributavel) produto).calcularImposto();
      }
    }

    System.out.println("Total de impostos: R$ " + String.format("%.2f", totalImposto));
  }
}
