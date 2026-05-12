package SistemaModelarCardapio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido extends ItemCardapio {
  private String cliente;


  List<ItemCardapio> itens;

  public Pedido(String cliente, String nomePedido, double precoBase) {
    super(nomePedido, precoBase);
    this.cliente = cliente;
    this.itens = new ArrayList<>();
  }

  /**
   * adiciona um item ao pedido
   * @param item o item a ser adicionado ao pedido
   */
  public void adicionarItem(ItemCardapio item) {
    itens.add(item);
  }


  public void fecharConta() {
    double total = 0;
    for (ItemCardapio item : itens) {
      total += item.calcularPrecoFinal();
    }
    System.out.println("Total a pagar: R$ " + total);
  }


}
