package org.grasp.informationexpert;

/**
 * Proporciona la información necesaria sobre la cantidad de productos disponibles y su costo total unitario.
 */
public class DetalleProducto {

  private Producto producto;
  private int cantidad;
  private double costoTotalProducto;

  public DetalleProducto(Producto producto, int cantidad) {
    this.producto = producto;
    this.cantidad = cantidad;
    this.costoTotalProducto = producto.getPrecio() * cantidad;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidad() {
    return cantidad;
  }

  public double getCostoTotalProducto() {
    return costoTotalProducto;
  }
}
