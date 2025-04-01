package org.grasp.tiendaenlinea.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

  private Cliente cliente;
  private List<ItemPedido> items;

  public Pedido(Cliente cliente) {
    this.cliente = cliente;
    this.items = new ArrayList<>();
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void agregarProducto(Producto producto, int cantidad) {
    if (producto.reducirStock(cantidad)) {
      items.add(new ItemPedido(producto, cantidad));
      System.out.println("Producto agregado al pedido.");
    } else {
      System.out.println("No se puede agregar el producto al pedido. Stock insuficiente.");
    }
  }

  public double calcularTotal() {
    double total = 0;
    for (ItemPedido item : items) {
      total += item.calcularSubtotal();
    }
    return total;
  }

  public void mostrarPedido() {
    System.out.println("Pedido de " + cliente.getNombre());
    for (ItemPedido item : items) {
      System.out.println("- " + item.getProducto().getNombre() + " x" + item.getCantidad() + ": $" + item.calcularSubtotal());
    }
    System.out.println("Total: $" + calcularTotal());
  }

}
