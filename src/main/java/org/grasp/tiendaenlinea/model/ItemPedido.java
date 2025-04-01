package org.grasp.tiendaenlinea.model;

public class ItemPedido {

  private Producto producto;
  private int cantidad;

  public ItemPedido(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public double calcularSubtotal() {
    return producto.getPrecio() * cantidad;
  }
}
