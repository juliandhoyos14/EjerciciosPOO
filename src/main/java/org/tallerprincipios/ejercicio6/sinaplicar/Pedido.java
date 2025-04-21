package org.tallerprincipios.ejercicio6.sinaplicar;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

  public List<Item> items;

  public Pedido() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    this.items.add(item);
  }
}
